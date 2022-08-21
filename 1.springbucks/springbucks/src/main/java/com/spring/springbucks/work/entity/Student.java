package com.spring.springbucks.work.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 学生信息表
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 学号
     */
    private Integer studentNum;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 状态
     */
    private String state;

    /**
     * 备注
     */
    private String remarks;


}
