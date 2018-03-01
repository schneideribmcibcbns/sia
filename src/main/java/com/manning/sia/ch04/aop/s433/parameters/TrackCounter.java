package com.manning.sia.ch04.aop.s433.parameters;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	@Pointcut("execution(* com.manning.sia.ch04.aop.s433.parameters.CompactDisk.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber) {}
	
	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber) {
		int currentCount = trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
		trackCounts.put(trackNumber, currentCount+1);
		System.out.println(trackCounts.toString());
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		trackCounts.forEach((k,v) -> {
			sb.append("Track: ")
			  .append(k)
			  .append(" Count: ")
			  .append(v)
			  .append("\n");
		});
		
		return sb.toString();
	}
}
