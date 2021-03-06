package com.example.equipment.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author southwind
 * @since 2020-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Wifiinputequipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    @TableField("equipmentMark")
    private String equipmentMark;

    @TableField("outputPort")
    private String outputPort;

    private String type;

    private String state;

    @TableField("areaID")
    private Integer areaID;

    @TableField("number")
    private String number;

    @TableField("standbyApplication02")
    private String standbyApplication02;

    @TableField("standbyApplication03")
    private String standbyApplication03;

    @TableField("standbyApplication04")
    private String standbyApplication04;


}
