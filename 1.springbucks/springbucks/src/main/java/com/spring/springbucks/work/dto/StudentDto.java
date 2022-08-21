package com.spring.springbucks.work.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * <p>
 * 学生信息表
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
@Setter
@Getter
public class StudentDto implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 姓名
     */
    @NotEmpty(message = "姓名")
    private String name;

    /**
     * 学号
     */
    @NotEmpty(message = "学号")
    private Integer studentNum;


}
