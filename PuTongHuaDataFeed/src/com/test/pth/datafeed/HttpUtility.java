package com.test.pth.datafeed;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class HttpUtility {

	public static String post(String urlPath, Map<String, String> headers, Map<String, String> form) throws IOException {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlPath);
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

		con.setRequestMethod("POST");
		for (Map.Entry<String, String> entry : headers.entrySet()) {
			con.setRequestProperty(entry.getKey(), entry.getValue());
	    }
		
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(makeUrlParameters(form));
		wr.flush();
		wr.close();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf8"));
		String line;

        while ((line = in.readLine()) != null) {
        	result.append(line);
        	result.append(System.lineSeparator());
        }
        in.close();
		return result.toString();
	}
	
	public static String makeUrlParameters(Map<String, String> form) throws UnsupportedEncodingException {
		StringBuilder result = new StringBuilder();
		boolean started = false;
		for (Map.Entry<String, String> entry : form.entrySet()) {
			result.append(URLEncoder.encode(entry.getKey(), "utf8"));
			result.append("=");
			result.append(URLEncoder.encode(entry.getValue(), "utf8"));
			if (started) result.append("&"); 
			started = true;
	    }
		return result.toString();
	}
	
}
