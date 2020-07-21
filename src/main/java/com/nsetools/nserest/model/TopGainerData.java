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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true )
public class TopGainerData {
    @JsonProperty("series")
    private String series;
    @JsonProperty("openPrice")
    private String openPrice;
    @JsonProperty("highPrice")
    private String highPrice;
    @JsonProperty("lowPrice")
    private String lowPrice;
    @JsonProperty("ltp")
    private String lastTradePrice;
    @JsonProperty("previousPrice")
    private String previousPrice;
    @JsonProperty("netPrice")
    private String netPrice;
    @JsonProperty("tradedQuantity")
    private String tradedQuantity;
    @JsonProperty("turnoverInLakhs")
    private String turnOverInLakhs;
    @JsonProperty("lastCorpAnnouncementDate")
    private String lastCorpAnnouncementDate;
    @JsonProperty("lastCorpAnnouncement")
    private String lastCorpAnnouncement;
}
