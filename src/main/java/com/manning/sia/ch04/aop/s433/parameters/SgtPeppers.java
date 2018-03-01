package com.manning.sia.ch04.aop.s433.parameters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class SgtPeppers implements CompactDisk {
	
	@Value("Sgt. Pepper's Lonely Hearts Club Band")
	private String title;
	
	@Value("The Beatles")
	private String artist;
	
	private List<String> tracks = new ArrayList<String>();

	@Override
	public void play() {
		for (int index = 0; index < tracks.size(); index++) {
			playTrack(index);
		}
	}

	@Override
	public void playTrack(int trackNumber) {
		System.out.println("Playing: title - " + title + " artist - " + artist + " track - " + trackNumber);
	}
	
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
}
