package com.nsetools.nserest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class IndexDataWrapper {

	private List<IndexData> data;
	
	private int code;

	public List<IndexData> getData() {
		return this.data;
	}
}
