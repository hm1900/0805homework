package com.spring.springbucks.work.mapper;

import com.spring.springbucks.work.entity.Fraction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 学生成绩表 Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
@Mapper
public interface FractionMapper {

    int insert(Fraction build);

    int update(Fraction build);

    int delete(String id);

    Fraction selectOne(Fraction build);

    int count(Fraction fraction);

    List<Fraction> selectPage(@Param("pageStart") int pageStart, @Param("pageSize") int pageSize, Fraction fraction);
}
