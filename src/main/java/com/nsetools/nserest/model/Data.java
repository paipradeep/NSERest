package com.nsetools.nserest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true )
public class Data {
    @JsonProperty("pricebandupper")
    private String pricebandupper;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("applicableMargin")
    private String applicableMargin;
    @JsonProperty("totalSellQuantity")
    private String totalSellQuantity;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("dayHigh")
    private String dayHigh;
    @JsonProperty("basePrice")
    private String basePrice;
    @JsonProperty("pricebandlower")
    private String pricebandlower;
    @JsonProperty("dayLow")
    private String dayLow;
    @JsonProperty("quantityTraded")
    private String quantityTraded;
    @JsonProperty("totalTradedValue")
    private String totalTradedValue;
    @JsonProperty("deliveryToTradedQuantity")
    private String deliveryToTradedQuantity;
    @JsonProperty("totalBuyQuantity")
    private String totalBuyQuantity;
    @JsonProperty("averagePrice")
    private String averagePrice;
    @JsonProperty("high52")
    private String high52;
    @JsonProperty("previousClose")
    private String previousClose;
    @JsonProperty("low52")
    private String low52;
    @JsonProperty("faceValue")
    private String faceValue;
    @JsonProperty("closePrice")
    private String closePrice;
    @JsonProperty("open")
    private String open;
    @JsonProperty("lastPrice")
    private String lastPrice;

}