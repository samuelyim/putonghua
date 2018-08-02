package com.test.pth.datafeed.objects;

import java.util.ArrayList;
import java.util.List;

public class ChineseChar {

	private String char1;
	private String char2;
	private String prefix;
	private int count;
	private List<Pinyin> pinyins = new ArrayList<Pinyin>();
	
	

	public String getChar1() {
		return char1;
	}
	public void setChar1(String char1) {
		this.char1 = char1;
	}
	public String getChar2() {
		return char2;
	}
	public void setChar2(String char2) {
		this.char2 = char2;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void addPinyin(String pinyin1, String pinyin2) {
		pinyins.add(new Pinyin(pinyin1, pinyin2));
	}
	public List<Pinyin> getPinyins() {
		return pinyins;
	}

	
	
}
