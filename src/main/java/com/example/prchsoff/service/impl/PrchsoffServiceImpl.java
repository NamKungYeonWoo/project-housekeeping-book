package com.example.prchsoff.service.impl;

import com.example.prchsoff.domain.Prchsoff;
import com.example.prchsoff.repository.PrchoffRepository;
import com.example.prchsoff.service.PrchsoffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
@Service
public class PrchsoffServiceImpl implements PrchsoffService {
    @Autowired
    PrchoffRepository prchoffRepository;

    @Override
    public List<Prchsoff> findAll() {
        return prchoffRepository.findAll();
    }

    @Override
    public Prchsoff create(Prchsoff prchsoff) {
        return prchoffRepository.save(prchsoff);
    }

    @Override
    public Prchsoff findOne(Long prchsoffId) {
        return prchoffRepository.findOne(prchsoffId);
    }

    @Override
    public void delete(Long prchsoffId) {
        prchoffRepository.delete(prchsoffId);
    }
}
