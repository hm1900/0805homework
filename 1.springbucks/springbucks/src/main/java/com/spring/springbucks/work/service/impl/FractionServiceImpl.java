package com.spring.springbucks.work.service.impl;

import com.spring.springbucks.work.dto.FractionDto;
import com.spring.springbucks.work.dto.QueryResult;
import com.spring.springbucks.work.entity.Fraction;
import com.spring.springbucks.work.mapper.FractionMapper;
import com.spring.springbucks.work.service.IFractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 学生成绩表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
@Service
public class FractionServiceImpl implements IFractionService {

    @Autowired
    private FractionMapper fractionMapper;

    @Override
    public int add(FractionDto fractionDto) {
        return fractionMapper.insert(Fraction.builder()
                .studentId(fractionDto.getStudentId())
                .subject(fractionDto.getSubject())
                .subjectName(fractionDto.getSubjectName())
                .fraction(fractionDto.getFraction())
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .state("1")//正常
                .build());
    }

    @Override
    public int update(FractionDto fractionDto) {
        return fractionMapper.update(Fraction.builder()
                .id(fractionDto.getId())
                .studentId(fractionDto.getStudentId())
                .subject(fractionDto.getSubject())
                .subjectName(fractionDto.getSubjectName())
                .fraction(fractionDto.getFraction())
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .state("1")//正常
                .build());
    }

    @Override
    public int delete(String id) {
        return fractionMapper.delete(id);
    }

    @Override
    public Fraction selectOne(FractionDto fractionDto) {
        return fractionMapper.selectOne(Fraction.builder()
                .studentId(fractionDto.getStudentId())
                .subject(fractionDto.getSubject())
                .subjectName(fractionDto.getSubjectName())
                .fraction(fractionDto.getFraction())
                .build());
    }

    @Override
    public QueryResult<Fraction> selectPage(FractionDto fractionDto) {
        Fraction fraction = Fraction.builder()
                .studentId(fractionDto.getStudentId())
                .subject(fractionDto.getSubject())
                .subjectName(fractionDto.getSubjectName())
                .fraction(fractionDto.getFraction())
                .build();
        //查询总数
        int count = fractionMapper.count(fraction);
        //查询分页数
        List<Fraction> fractions = fractionMapper.selectPage(fractionDto.getPageStart(), fractionDto.getPageSize(), fraction);

        QueryResult<Fraction> queryResult = new QueryResult();
        queryResult.setResultList(fractions);
        queryResult.setTotalRecord(count);
        return queryResult;
    }
}
