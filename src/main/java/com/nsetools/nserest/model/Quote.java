package com.nsetools.nserest.model;

import java.util.List;

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
public class Quote {
    @JsonProperty("tradedDate")
    private String tradedDate;
    @JsonProperty("data")
    private List<QuoteData> data;
    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;
}