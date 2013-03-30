package com.stylepopz.app.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.stylepopz.app.model.Item;
import com.stylepopz.app.model.Response;
import com.stylepopz.app.util.CopyUtil;

public class TestAlchemy {
	
	
	
	
	public static InputStream getJSON(String url, int timeout) {
		try {
			URL u = new URL(url);
			System.out.println("URL "+u);
			HttpURLConnection c = (HttpURLConnection) u.openConnection();
			c.setRequestMethod("GET");
			c.setRequestProperty("Content-length", "0");
			c.setUseCaches(false);
			c.setAllowUserInteraction(false);
			c.setConnectTimeout(timeout);
			c.setReadTimeout(timeout);
			c.connect();
			int status = c.getResponseCode();

			switch (status) {
			case 200:
			case 201:
				return c.getInputStream();
				
				}
		    } catch (MalformedURLException ex) {
			ex.printStackTrace();
			//Logger.getLogger(this.getClass().toString()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			ex.printStackTrace();
			//Logger.getLogger(this.getClass().toString()).log(Level.SEVERE, null, ex);;
		}
		return null;
	}
	
   	
       	
	 
	 public static void main(String[] args) throws Exception{
		 String destination;
		 InputStream source;
		 TestAlchemy test = new TestAlchemy();
		 
		 destination = "c:\\proj\\crawler.txt";
		 source = getJSON("http://access.alchemyapi.com/calls/url/URLGetRankedKeywords?apikey=aad473649252d5b81f30d5950b95863faa211076&url=thesfstyle.com&outputMode=json",60000);
		 CopyUtil.copyFile(source,new File(destination));
		 
		 String temp = CopyUtil.readFile(new File(destination));
		 System.out.println(temp.toString());
		 test.populateResponse(temp);
		 temp=null;
		 
//		 destination = "c:\\proj\\aggregator.txt";
//		 String item2 = "completely different look";
//		 source = getJSON("http://api.shopstyle.com/api/v2/products?pid=uid3344-9270688-60&fts="+item2.replace(" ", "+")+"&offset=0&limit=10",60000);
//		 CopyUtil.copyFile(source,new File(destination));
//		 
//		 temp = CopyUtil.readFile(new File(destination));
//		 System.out.println(temp.toString());
	}
	 
	 private void populateResponse(String response) {
		 List<Response> alchemyResponse = new ArrayList<Response>();
		 
		 String destination = "c:\\proj\\aggregator1.txt";
		 int i = 1;
		 alchemyResponse.add(new Gson().fromJson(response, Response.class));
		 Response resp = alchemyResponse.get(0);
	     ArrayList<Item> item = resp.getKeywords();
	     for (Iterator iterator = item.iterator(); iterator.hasNext();) {
	    	 
			Item item2 = (Item) iterator.next();
			System.out.println(item2.text);
			System.out.println(item2.relevance);
			item2.text.replace(" ", "+");
			InputStream data1 = getJSON("http://api.shopstyle.com/api/v2/products?pid=uid3344-9270688-60&fts="+item2.text.replace(" ", "+")+"&offset=0&limit=10",60000);
			 
			try {
			CopyUtil.copyFile(data1,new File(destination+i+".txt"));
			}
			catch(IOException io){
				io.printStackTrace();
			}
			//list.add(new Gson().fromJson(data1, Product.class));
			i++;			
		}
	 }
	
}
