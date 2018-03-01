package com.manning.sia.ch03.s5.runtimevalueinjection.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiskFromValue {
	private String title;
	private String artist;
	
	public DiskFromValue(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {
		this.artist = artist;
		this.title = title;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getClass().getName())
		  .append(" ")
		  .append(title)
		  .append(" ")
		  .append(artist);
		
		return sb.toString();
	}
}
