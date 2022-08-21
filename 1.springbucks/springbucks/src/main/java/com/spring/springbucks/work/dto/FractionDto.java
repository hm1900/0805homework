package com.spring.springbucks.work.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * <p>
 * 学生成绩表
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
@Setter
@Getter
public class FractionDto implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Long id;

    /**
     * 学生信息id
     */
    @NotEmpty(message = "学生信息id")
    private Long studentId;

    /**
     * 学科
     */
    @NotEmpty(message = "学科")
    private String subject;

    /**
     * 学科名称
     */
    @NotEmpty(message = "学科名称")
    private String subjectName;

    /**
     * 分数
     */
    @NotEmpty(message = "分数")
    private Double fraction;

    private Integer pageStart;

    private Integer pageSize;


}
