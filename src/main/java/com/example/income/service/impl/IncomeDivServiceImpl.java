package com.example.income.service.impl;

import com.example.income.domain.IncomeDiv;
import com.example.income.repository.IncomeDivRepository;
import com.example.income.service.IncomeDivService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
@Service
public class IncomeDivServiceImpl implements IncomeDivService
{
    @Autowired
    IncomeDivRepository incomeDivRepository;

    @Override
    public List<IncomeDiv> findAll()
    {
        return incomeDivRepository.findAll();
    }

    @Override
    public IncomeDiv findOne(Long incomeDiv)
    {
        return incomeDivRepository.findOne(incomeDiv);
    }

    @Override
    public IncomeDiv create(IncomeDiv incomeDiv) {
        return incomeDivRepository.save(incomeDiv);
    }

    @Override
    public void delete(Long incomeDiv) {
        incomeDivRepository.delete(incomeDiv);
    }
}
