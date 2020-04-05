package com.aweolumidedavid.covid19stat.controllers;

import com.aweolumidedavid.covid19stat.model.SuppliesToTheCountry;
import com.aweolumidedavid.covid19stat.service.SuppliesToTheCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/supplies")
public class SuppliesToTheCountryController {

    @Autowired
    private SuppliesToTheCountryService s;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<SuppliesToTheCountry>> getSupplyDetails() {

        List<SuppliesToTheCountry> supplies = s.getSupplyDetails();
        return new ResponseEntity<List<SuppliesToTheCountry>>(supplies, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<SuppliesToTheCountry>> findById(@PathVariable(name = "id", value = "id") Long id) {

        Optional<SuppliesToTheCountry> supply = s.findById(id);
        return new ResponseEntity <Optional<SuppliesToTheCountry>>(supply, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<SuppliesToTheCountry> findById(@RequestBody SuppliesToTheCountry supplies) {

        SuppliesToTheCountry supply = s.save(supplies);
        return new ResponseEntity<SuppliesToTheCountry>(supply, HttpStatus.OK);
    }

    @RequestMapping(value = "/supplyName/{supplyName:.+}", method = RequestMethod.GET)
    public ResponseEntity<SuppliesToTheCountry> findById(@PathVariable(name = "stateName", value = "stateName") String supplierName) {

        SuppliesToTheCountry supplier = s.findBySupplierName(supplierName);
        return new ResponseEntity<SuppliesToTheCountry>(supplier, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable(name = "id", value = "id") Long id) {

        s.delete(id);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }

}
