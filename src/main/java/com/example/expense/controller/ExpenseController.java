package com.example.expense.controller;

import com.example.expense.domain.Expense;
import com.example.expense.service.ExpenseService;
import com.example.expense.domain.Expense;
import com.example.expense.dto.ExpenseDto;
import com.example.income.dto.IncomeDto;
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
 * @since 2016-02-28
 */
@Controller
@RequestMapping("expense")
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @RequestMapping("list")
    String list(Model model) {
        List<Expense> expenseList = expenseService.findAll();

        ExpenseDto expenseDto = new ExpenseDto();

        model.addAttribute("expenseDto", expenseDto);

        model.addAttribute("expenseList", expenseList);

        return "expense/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(@Validated ExpenseDto expenseDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }

        Expense expense = new Expense();

        BeanUtils.copyProperties(expenseDto, expense);

        expenseService.create(expense);

        return "redirect:/expense/list";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    String delete(@RequestParam Long expenseId) {
        expenseService.delete(expenseId);

        return "redirect:/expense/list";
    }
}
