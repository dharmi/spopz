package com.stylepopz.app.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class JsonUtil {

	public static String getJSON(String url, int timeout) {
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
				BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line+"\n");
				}
				br.close();
				return sb.toString();
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

}
