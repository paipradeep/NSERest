package com.nsetools.nserest.core;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DataFetchManager {

	private static final String QUOTE_BASE_URL = "https://www1.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?";

	private static final String QUOTE_ARGS = "&illiquid=0&smeFlag=0&itpFlag=0";

	public static final String QUOTE_RESPONSE_DIV = "responseDiv";
	
	public String getQuoteFetchURL(String companyName) {
		StringBuilder quoteURL = new StringBuilder(QUOTE_BASE_URL);
		quoteURL.append("symbol=");
		quoteURL.append(companyName);
		quoteURL.append(QUOTE_ARGS);
		return quoteURL.toString();

	}

	public String getDomElementAsJSON(String url, String id) {

		String domEleAsJSON = null;
		WebClient client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		try {
			HtmlPage page = client.getPage(url);
			DomElement domElement = page.getElementById(id);
			domEleAsJSON = domElement.asText();
		} catch (FailingHttpStatusCodeException fsce) {

		} catch (MalformedURLException me) {

		} catch (IOException ioe) {

		} finally {
			client.close();
		}		
		System.out.println("Dom element as JSON for url - " + url + " and id - " + id + ":" + domEleAsJSON);
		return domEleAsJSON;

	}
}