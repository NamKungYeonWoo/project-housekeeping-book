package com.example.prchsoff.service;

import com.example.prchsoff.domain.Prchsoff;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface PrchsoffService
{
    List<Prchsoff> findAll();

    Prchsoff create(Prchsoff prchsoff);

    Prchsoff findOne(Long prchsoffId);

    void delete(Long prchsoffId);
}
