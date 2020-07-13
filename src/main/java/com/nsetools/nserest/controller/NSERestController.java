package com.nsetools.nserest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nsetools.nserest.core.*;
import com.nsetools.nserest.model.Quote;

@RestController
public class NSERestController {
	
	@GetMapping("/getQuote")
	public Quote quote(@RequestParam(value = "companySymbol") String companySymbol) {
		
		DataFetchManager dfm = new DataFetchManager();
		String quoteJSON = dfm.getDomElementAsJSON(dfm.getQuoteFetchURL(companySymbol), DataFetchManager.QUOTE_RESPONSE_DIV );

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(quoteJSON, Quote.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@GetMapping("topGainers")
	public Object topGainers() {
		DataFetchManager dfm = new DataFetchManager();
		String jsonResponse = dfm.getResponseAsJSON(url)
		return null;
	}
}
