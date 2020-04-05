package com.aweolumidedavid.covid19stat.model;

import javax.persistence.*;

@Entity
@Table
public class StateStat {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String state;
    @Column
    private int totalCases;
    @Column
    private int totalDeaths;
    @Column
    private int totalRecovered;
    @Column
    private int newCases;
    @Column
    private int newDeaths;
    @Column
    private int newRecoveries;
    @Column
    private int activeCases;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public int getNewCases() {
        return newCases;
    }

    public void setNewCases(int newCases) {
        this.newCases = newCases;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(int newDeaths) {
        this.newDeaths = newDeaths;
    }

    public int getNewRecoveries() {
        return newRecoveries;
    }

    public void setNewRecoveries(int newRecoveries) {
        this.newRecoveries = newRecoveries;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    @Override
    public String toString() {
        return "StateStat{" +
                "State='" + state + '\'' +
                ", totalCases=" + totalCases +
                ", totalDeaths=" + totalDeaths +
                ", totalRecovered=" + totalRecovered +
                ", newCases=" + newCases +
                ", newDeaths=" + newDeaths +
                ", newRecovered=" + newRecoveries +
                ", activeCases=" + activeCases +
                '}';
    }
}
