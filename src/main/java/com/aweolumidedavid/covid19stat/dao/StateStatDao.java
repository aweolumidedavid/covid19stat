package com.aweolumidedavid.covid19stat.dao;

import com.aweolumidedavid.covid19stat.model.StateStat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateStatDao extends CrudRepository<StateStat, Long> {

    StateStat findByState(String stateName);

}
