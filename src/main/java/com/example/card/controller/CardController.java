package com.example.card.controller;

import com.example.card.domain.Card;
import com.example.card.dto.CardDto;
import com.example.card.service.CardService;
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
@RequestMapping("card")
public class CardController {
    @Autowired
    CardService cardService;

    @RequestMapping("list")
    String list(Model model) {
        List<Card> cardList = cardService.findAll();

        model.addAttribute("cardList", cardList);

        return "card/list";
    }

    @RequestMapping("regist")
    String regist(Model model) {
        CardDto cardDto = new CardDto();

        model.addAttribute("cardDto", cardDto);

        return "card/regist";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(@Validated CardDto cardDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }

        Card card = new Card();

        BeanUtils.copyProperties(cardDto, card);

//        cardService.create(card);

        return "redirect:/card/list";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    String delete(@RequestParam Long cardId) {
//        cardService.delete(cardId);

        return "redirect:/card/list";
    }
}
