package test.test.pth.datafeed;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.test.pth.datafeed.utils.HttpUtility;

public class Test {

	public static void main(String[] args) {
		String urlPath = "https://www.putonghuaweb.com/agent/searchcharagent.php";
//		String urlPath = "https://www.putonghuaweb.com/onlinedict/chardict.php?charID=44";
		Map<String, String> headers = new TreeMap<String, String>();
		Map<String, String> form = new TreeMap<String, String>();
		
		headers.put("Accept", "*/*");
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept-Language", "en-US,en;q=0.9");
		headers.put("Cache-Control", "no-cache");
		headers.put("Connection", "keep-alive");
		headers.put("Content-Length", "9");
		headers.put("Content-Type", "application/x-www-form-urlencoded");
		headers.put("Cookie", "PHPSESSID=4li428uo9den3gm17oe8389gf4; _ga=GA1.2.574873468.1532333136; _gid=GA1.2.964996020.1532333136; _gat=1");
		headers.put("Host", "www.putonghuaweb.com");
		headers.put("Origin", "https://www.putonghuaweb.com");
		headers.put("Pragma", "no-cache");
		headers.put("Referer", "https://www.putonghuaweb.com/onlinedict/chardict.php?charID=44");
		headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
		
		form.put("charid", "44");
		
		String result=null;
		try {
			result = HttpUtility.post(urlPath, headers, form);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}

}
