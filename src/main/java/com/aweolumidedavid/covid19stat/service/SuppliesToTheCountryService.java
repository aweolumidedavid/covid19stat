package com.aweolumidedavid.covid19stat.service;

import com.aweolumidedavid.covid19stat.model.SuppliesToTheCountry;

import java.util.List;
import java.util.Optional;

public interface SuppliesToTheCountryService {

    List<SuppliesToTheCountry> getSupplyDetails();

    Optional<SuppliesToTheCountry> findById(Long id);

    SuppliesToTheCountry save(SuppliesToTheCountry suppliesToTheCountry);

    SuppliesToTheCountry findBySupplierName(String supplierName);

    void delete(Long id);
}
