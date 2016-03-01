package com.example.income.controller;

import com.example.income.domain.Income;
import com.example.income.dto.IncomeDto;
import com.example.income.service.IncomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
@Controller
@RequestMapping("income")
public class IncomeController {
    @Autowired
    IncomeService incomeService;

    @RequestMapping("list")
    String list(Model model) {
        List<Income> incomeList = incomeService.findAll();

        model.addAttribute("incomeList", incomeList);

        return "income/list";
    }

    @RequestMapping("regist")
    String regist(Model model) {
        IncomeDto incomeDto = new IncomeDto();

        model.addAttribute("incomeDto", incomeDto);

        return "income/regist";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(@Validated IncomeDto incomeDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }

        Income income = new Income();

        BeanUtils.copyProperties(incomeDto, income);

//        incomeService.create(income);

        return "redirect:/income/list";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    String delete(@RequestParam Long incomeId) {
//        incomeService.delete(incomeId);

        return "redirect:/income/list";
    }
}
