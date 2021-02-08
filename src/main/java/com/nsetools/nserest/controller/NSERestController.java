package com.nsetools.nserest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nsetools.nserest.core.*;
import com.nsetools.nserest.model.IndexData;
import com.nsetools.nserest.model.IndexDataWrapper;
import com.nsetools.nserest.model.Quote;
import com.nsetools.nserest.model.QuoteData;
import com.nsetools.nserest.model.TopGainer;

@RestController
@RequestMapping(path="/NSEData")
public class NSERestController {
	
	@GetMapping("/getQuote")
	public QuoteData quote(@RequestParam(value = "companySymbol") String companySymbol) {
		
		DataFetchManager dfm = new DataFetchManager();
		String quoteJSON = dfm.getDomElementAsJSON(dfm.getQuoteFetchURL(companySymbol), DataFetchManager.QUOTE_RESPONSE_DIV );

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Quote quote = objectMapper.readValue(quoteJSON, Quote.class);
			List<QuoteData> quoteData = quote.getData();
			
			return quoteData != null? quoteData.get(0) : null;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@GetMapping("/topGainers")
	public TopGainer topGainers() {
		DataFetchManager dfm = new DataFetchManager();
		String topGainerJSON = dfm.getResponseAsJSON(DataFetchManager.TOP_GAINERS_BASE_URL);
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			TopGainer topGainer = objectMapper.readValue(topGainerJSON, TopGainer.class);
			return topGainer;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/indexList")
	public Object indexList() {
		DataFetchManager dfm = new DataFetchManager();
		String indexListJson = dfm.getResponseAsJSON(DataFetchManager.INDEX_DATA_URL);
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			IndexDataWrapper indexData = objectMapper.readValue(indexListJson, IndexDataWrapper.class);
			
			List<IndexData> indexList = indexData.getData();
			List<String> indices = dfm.getAllIndicesNames(indexList);
			
			return indices;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

	}
	
}
