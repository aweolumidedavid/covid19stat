package com.aweolumidedavid.covid19stat.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuppliesToTheCountry {

    @Id
    private Long id;

    private String supplierName;
    private int numberOfFaceMask;
    private int numberOfTestingKit;
    private int numberOfVentilators;
    private String totalWorth;
    private int amount;

    public String getTotalWorth() {
        return totalWorth;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTotalWorth(String totalWorth) {
        this.totalWorth = totalWorth;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getNumberOfFaceMask() {
        return numberOfFaceMask;
    }

    public void setNumberOfFaceMask(int numberOfFaceMask) {
        this.numberOfFaceMask = numberOfFaceMask;
    }

    public int getNumberOfTestingKit() {
        return numberOfTestingKit;
    }

    public void setNumberOfTestingKit(int numberOfTestingKit) {
        this.numberOfTestingKit = numberOfTestingKit;
    }

    public int getNumberOfVentilators() {
        return numberOfVentilators;
    }

    public void setNumberOfVentilators(int numberOfVentilators) {
        this.numberOfVentilators = numberOfVentilators;
    }
}
