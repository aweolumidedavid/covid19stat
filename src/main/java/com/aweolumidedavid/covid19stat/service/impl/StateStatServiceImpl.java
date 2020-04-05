package com.aweolumidedavid.covid19stat.service.impl;


import com.aweolumidedavid.covid19stat.dao.StateStatDao;
import com.aweolumidedavid.covid19stat.model.StateStat;
import com.aweolumidedavid.covid19stat.service.StateStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateStatServiceImpl  implements StateStatService {

    @Autowired
    private StateStatDao stateStatDao;

    @Override
    public List<StateStat> getStateStatDetails() {
        return (List<StateStat>) stateStatDao.findAll();
    }

    @Override
    public Optional<StateStat> findById(Long id) {
        return (Optional<StateStat>) stateStatDao.findById(id);
    }

    @Override
    public StateStat save(StateStat stateStat) {
        return  stateStatDao.save(stateStat);
    }

    @Override
    public StateStat findByState(String stateName) {
        return  stateStatDao.findByState(stateName);
    }

    @Override
    public void delete(Long id) {
        stateStatDao.deleteById(id);
    }
}
