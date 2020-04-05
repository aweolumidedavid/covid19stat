package com.aweolumidedavid.covid19stat.controllers;

import com.aweolumidedavid.covid19stat.model.StateStat;
import com.aweolumidedavid.covid19stat.service.StateStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/statestats")
public class StateStatController {

    @Autowired
    private StateStatService stateStatService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<StateStat>> getStateStatDetails() {

        List<StateStat> stateStats = stateStatService.getStateStatDetails();
        return new ResponseEntity<List<StateStat>>(stateStats, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<StateStat>> findById(@PathVariable(name = "id", value = "id") Long id) {

       Optional<StateStat> stateStat = stateStatService.findById(id);
        return new ResponseEntity <Optional<StateStat>>(stateStat, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<StateStat> findById(@RequestBody StateStat stateStat) {

        StateStat stat = stateStatService.save(stateStat);
        return new ResponseEntity<StateStat>(stat, HttpStatus.OK);
    }

    @RequestMapping(value = "/stateName/{stateName:.+}", method = RequestMethod.GET)
    public ResponseEntity<StateStat> findById(@PathVariable(name = "stateName", value = "stateName") String stateName) {

        StateStat stateStat = stateStatService.findByState(stateName);
        return new ResponseEntity<StateStat>(stateStat, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable(name = "id", value = "id") Long id) {

        stateStatService.delete(id);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }

//    @PutMapping("{id}")
//    public StateStat updateStateStat(@PathVariable Long id, @RequestBody StateStat stateStat) {
//        StateStat stateStatToUpdate = stateStatService.findById(id);
//        stateStatToUpdate.setState(stateStat.getState());
//        stateStatToUpdate.setTotalCases(stateStat.getTotalCases());
//        stateStatToUpdate.setTotalDeaths(stateStat.getTotalDeaths());
//        stateStatToUpdate.setTotalRecovered(stateStat.getTotalRecovered());
//        stateStatToUpdate.setNewCases(stateStat.getNewCases());
//        stateStatToUpdate.setNewDeaths(stateStat.getNewDeaths());
//        stateStatToUpdate.setNewRecoveries(stateStat.getNewRecoveries());
//        stateStatToUpdate.setActiveCases(stateStat.getActiveCases());
//
//        return stateStatService.save(stateStatToUpdate);
//    }

}
