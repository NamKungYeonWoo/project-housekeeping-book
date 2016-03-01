package com.example.prchsoff.controller;

import com.example.prchsoff.domain.Prchsoff;
import com.example.prchsoff.dto.PrchsoffResDto;
import com.example.prchsoff.service.PrchsoffService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Moon, Keum Hwan
 * @since 2016-03-01
 */
@RestController
@RequestMapping("prchsoff")
public class PrchsoffRestController {
    @Autowired
    PrchsoffService service;

    @Autowired
    ModelMapper mapper;

    @RequestMapping(method = RequestMethod.GET)
    List<Prchsoff> fetchAll () {
        List<Prchsoff> prchsoffList = service.findAll();

        List<PrchsoffResDto.ResList> response =
                prchsoffList.stream()
                        .map(prchsoff -> mapper.map(prchsoff, PrchsoffResDto.ResList.class))
                        .collect(Collectors.toList());

        return prchsoffList;
    }

}
