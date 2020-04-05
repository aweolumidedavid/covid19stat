package com.aweolumidedavid.covid19stat.controllers;

import com.aweolumidedavid.covid19stat.dao.StateStatDao;
import com.aweolumidedavid.covid19stat.dao.SuppliesToTheCountryDao;
import com.aweolumidedavid.covid19stat.model.StateStat;
import com.aweolumidedavid.covid19stat.service.StateStatService;
import com.aweolumidedavid.covid19stat.service.SuppliesToTheCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

   @Autowired
   private SuppliesToTheCountryService suppliesToTheCountryService;
   private StateStatService stateStatService;

    @GetMapping({"/home"})
    public String home(Model model){

        return "home";
    }
}
