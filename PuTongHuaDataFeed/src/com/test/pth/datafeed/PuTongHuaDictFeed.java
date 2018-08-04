package com.test.pth.datafeed;

import java.util.Map;

public class PuTongHuaDictFeed extends PuTongHuaDefaultFeed {

	public int getMin() {
		return 1;
	}
	
	public int getMax() {
		return 13083;
	}
	
	public String getFilePath() {
		return FILE_PATH + "Word/";
	}

	public String getUrlPath() {
		return "https://www.putonghuaweb.com/agent/searchcharagent.php";
	}
	
	protected void downloadSetup(int pos, Map<String, String> headers, Map<String, String> form) {
		headers.put("Referer", "https://www.putonghuaweb.com/onlinedict/chardict.php?charID=" + pos);
		form.put("charid", "" + pos);
	}

	public static void main(String[] args) {
		PuTongHuaDictFeed feed = new PuTongHuaDictFeed();
		feed.downloadAll();
	}

}
