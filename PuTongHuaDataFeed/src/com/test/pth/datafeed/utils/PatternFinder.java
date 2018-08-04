package com.test.pth.datafeed.utils;

public class PatternFinder {

	public static String find(String source, String begin, String end) {
		int pos1 = source.indexOf(begin);
		if (pos1>=0) {
			int pos2 = source.indexOf(end, pos1 + begin.length());
			if (pos1>=0 && pos2>=0) return source.substring(pos1,  pos2+end.length());
		}
		return null;
	}
	
}
