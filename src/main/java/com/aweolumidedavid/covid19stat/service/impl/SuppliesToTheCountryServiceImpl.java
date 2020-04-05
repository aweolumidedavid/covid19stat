package com.aweolumidedavid.covid19stat.service.impl;

import com.aweolumidedavid.covid19stat.dao.SuppliesToTheCountryDao;
import com.aweolumidedavid.covid19stat.model.SuppliesToTheCountry;
import com.aweolumidedavid.covid19stat.service.SuppliesToTheCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuppliesToTheCountryServiceImpl implements SuppliesToTheCountryService {

    @Autowired
    private SuppliesToTheCountryDao suppliesToTheCountryDao;

    @Override
    public List<SuppliesToTheCountry> getSupplyDetails() {
        return (List<SuppliesToTheCountry>) suppliesToTheCountryDao.findAll();
    }

    @Override
    public Optional<SuppliesToTheCountry> findById(Long id) {
        return (Optional<SuppliesToTheCountry>) suppliesToTheCountryDao.findById(id);
    }

    @Override
    public SuppliesToTheCountry save(SuppliesToTheCountry suppliesToTheCountry) {
        return  suppliesToTheCountryDao.save(suppliesToTheCountry);
    }

    @Override
    public SuppliesToTheCountry findBySupplierName(String supplierName) {
        return  suppliesToTheCountryDao.findBySupplierName(supplierName);
    }

    @Override
    public void delete(Long id) {
        suppliesToTheCountryDao.deleteById(id);
    }
}
