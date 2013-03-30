package com.stylepopz.app.aggregator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.google.gson.Gson;
import com.stylepopz.app.classifier.Classifier;
import com.stylepopz.app.classifier.ClassifierFactory;
import com.stylepopz.app.model.Item;
import com.stylepopz.app.model.Response;
import com.stylepopz.app.shopstyle.Product;
import com.stylepopz.app.util.JsonUtil;


public class PopSugar implements Aggregator {

	public String getAggregatorData(String classifierUrl) {
		
		 List<Response> response = new ArrayList<Response>();
		 List<Product> list = new ArrayList<Product>();
		 
		 String classifierType = "Alchemy";
	    // String url = "http://www.calivintage.com/";

	     Classifier aggregator = ClassifierFactory.createClassifier(classifierType);
		 String data = aggregator.getClassifierData(classifierUrl).toString();
	     System.out.println(data.toString());
	     response.add(new Gson().fromJson(data, Response.class));

	     System.out.println("Getting data from ShopSense ");
	     System.out.println("************************************");
	     
	     Response resp = response.get(0);
	     ArrayList<Item> item = resp.getKeywords();
	     for (Iterator<Item> iterator = item.iterator(); iterator.hasNext();) {
			Item item2 = (Item) iterator.next();
			System.out.println(item2.text);
			item2.text.replace(" ", "+");
			System.out.println(item2.relevance);
			//String data1 = Util.getJSON("http://api.shopstyle.com/api/v2/products/"+item2.text+"?pid=uid3344-9270688-60", 60000);
			String data1 = JsonUtil.getJSON("http://api.shopstyle.com/api/v2/products?pid=uid3344-9270688-60&fts="+item2.text.replace(" ", "+")+"&offset=0&limit=10",60000);
			//list.add(new Gson().fromJson(data1, Product.class));
		
    	 }
		return data;
	}


}


