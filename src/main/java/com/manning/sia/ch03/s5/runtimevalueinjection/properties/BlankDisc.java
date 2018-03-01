package com.manning.sia.ch03.s5.runtimevalueinjection.properties;

public class BlankDisc {

	private final String title;
	private final String artist;
	
	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
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
