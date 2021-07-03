package com.example.jazs16587nbp.model;

import io.swagger.annotations.ApiModelProperty;

public class Rate {
    @ApiModelProperty(notes = "Number of tabel", required = true, value = "some value", example = "1")
    private String no;
    @ApiModelProperty(notes = "Date of publication", required = true, value = "some value", example = "1")
    private String effectiveDate;
    @ApiModelProperty(notes = "converted average exchange rate of the currency", required = true, value = "some value", example = "1")
    private String mid;

    public String getNo() { return no; }

    public void setNo(String no) { this.no = no; }

    public String getEffectiveDate() { return effectiveDate; }

    public void setEffectiveDate(String effectiveDate) { this.effectiveDate = effectiveDate; }

    public String getMid() { return mid; }

    public void setMid(String mid) { this.mid = mid; }

    public Rate(){
    }

}
