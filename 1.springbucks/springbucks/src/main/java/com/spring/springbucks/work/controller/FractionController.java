package com.spring.springbucks.work.controller;


import com.spring.springbucks.work.dto.FractionDto;
import com.spring.springbucks.work.dto.QueryResult;
import com.spring.springbucks.work.entity.Fraction;
import com.spring.springbucks.work.service.IFractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 学生成绩表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2022-08-18
 */
@RestController
@RequestMapping("/fraction")
public class FractionController {

    @Autowired
    private IFractionService iFractionService;

    @RequestMapping("/add")
    public String add(@RequestBody FractionDto fractionDto) {
        int i = iFractionService.add(fractionDto);
        if (i <= 0) {
            return "fail";
        }
        return "success";
    }

    @RequestMapping("/update")
    public String update(@RequestBody FractionDto fractionDto) {
        int i = iFractionService.update(fractionDto);
        if (i <= 0) {
            return "fail";
        }
        return "success";
    }

    @RequestMapping("/delete")
    public String delete(String id) {
        int i = iFractionService.delete(id);
        if (i <= 0) {
            return "fail";
        }
        return "success";
    }

    @RequestMapping("/selectOne")
    public Fraction selectOne(@RequestBody FractionDto fractionDto) {
        Fraction fraction = iFractionService.selectOne(fractionDto);
        return fraction;
    }

    @RequestMapping("/selectPage")
    public QueryResult<Fraction> selectPage(@RequestBody FractionDto fractionDto) {
        QueryResult<Fraction> queryResult = iFractionService.selectPage(fractionDto);
        return queryResult;
    }

}
