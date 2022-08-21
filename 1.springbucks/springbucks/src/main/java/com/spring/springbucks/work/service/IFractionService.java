package com.spring.springbucks.work.service;

import com.spring.springbucks.work.dto.FractionDto;
import com.spring.springbucks.work.dto.QueryResult;
import com.spring.springbucks.work.entity.Fraction;

/**
 * <p>
 * 学生成绩表 服务类
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
public interface IFractionService {

    int add(FractionDto fractionDto);

    int update(FractionDto fractionDto);

    int delete(String id);

    Fraction selectOne(FractionDto fractionDto);

    QueryResult<Fraction> selectPage(FractionDto fractionDto);
}
