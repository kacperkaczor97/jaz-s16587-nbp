package com.example.jazs16587nbp.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Root {
    @ApiModelProperty(notes = "Type of Table", required = true, value = "some tables", example = "1")
    private String table;
    @ApiModelProperty(notes = "Name of Currency", required = true, value = "some currencies", example = "1")
    private String currency;
    @ApiModelProperty(notes = "list of exchange rates of individual currencies in the table", required = true, value = "some rates", example = "1")
    private List<Rate> rates;

    public Root() {

    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
