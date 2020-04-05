package com.aweolumidedavid.covid19stat.service;

import com.aweolumidedavid.covid19stat.model.StateStat;

import java.util.List;
import java.util.Optional;

public interface StateStatService {

    List<StateStat> getStateStatDetails();

    Optional<StateStat> findById(Long id);

    StateStat save(StateStat stateStat);

    StateStat findByState(String stateName);

    void delete(Long id);
}
