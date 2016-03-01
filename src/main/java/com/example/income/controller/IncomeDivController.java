package com.example.income.controller;

import com.example.income.domain.IncomeDiv;
import com.example.income.dto.IncomeDivDto;
import com.example.income.service.IncomeDivService;
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
@RequestMapping("incomeDiv")
public class IncomeDivController {
    @Autowired
    IncomeDivService incomeDivService;

    @RequestMapping("list")
    String list(Model model) {
        List<IncomeDiv> incomeDivList = incomeDivService.findAll();

        model.addAttribute("incomeDivList", incomeDivList);

        return "incomeDiv/list";
    }

    @RequestMapping("regist")
    String regist(Model model) {
        IncomeDivDto incomeDivDto = new IncomeDivDto();

        model.addAttribute("incomeDivDto", incomeDivDto);

        return "incomeDiv/regist";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(@Validated IncomeDivDto incomeDivDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }

        IncomeDiv incomeDiv = new IncomeDiv();

        BeanUtils.copyProperties(incomeDivDto, incomeDiv);

        incomeDivService.create(incomeDiv);

        return "redirect:/incomeDiv/list";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    String delete(@RequestParam Long incomeDivId) {
        incomeDivService.delete(incomeDivId);

        return "redirect:/incomeDiv/list";
    }
}
