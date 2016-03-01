package com.example.cash.controller;

import com.example.cash.domain.Cash;
import com.example.cash.dto.CashDto;
import com.example.cash.service.CashService;
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
@RequestMapping("cash")
public class CashController {
    @Autowired
    CashService cashService;

    @RequestMapping("list")
    String list(Model model) {
        List<Cash> cashList = cashService.findAll();

        model.addAttribute("cashList", cashList);

        return "cash/list";
    }

    @RequestMapping("regist")
    String regist(Model model) {
        CashDto cashDto = new CashDto();

        model.addAttribute("cashDto", cashDto);

        return "cash/regist";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(@Validated CashDto cashDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }

        Cash cash = new Cash();

        BeanUtils.copyProperties(cashDto, cash);

        cashService.create(cash);

        return "redirect:/cash/list";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    String delete(@RequestParam Long cashId) {
        cashService.delete(cashId);

        return "redirect:/cash/list";
    }
}
