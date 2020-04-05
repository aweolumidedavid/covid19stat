package com.aweolumidedavid.covid19stat.dao;

import com.aweolumidedavid.covid19stat.model.SuppliesToTheCountry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliesToTheCountryDao extends CrudRepository<SuppliesToTheCountry,Long> {

    SuppliesToTheCountry findBySupplierName(String supplierName);
}
