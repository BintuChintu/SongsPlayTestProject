package com.test.songsplay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SongsPlayTest {
	
	private static List<String>  resultantList ;
	private static List<String> playsit = new ArrayList<String>(3);
	private static HashMap<String,ArrayList<String>> songsPlayListMap = new HashMap<String,ArrayList<String>>();
	public static void main(String[] args) {
		playsit.add("s1");
		playsit.add("s2");
		playsit.add("s3");
		songsPlayListMap.put("User1", (ArrayList<String>) playsit);
		System.out.println("Intaial User play lists are:"+songsPlayListMap);
		System.out.println("User1 played list is:"+songsPlayListMap.get("user1"));
		System.out.println("#################Test1########User1 played S4#########################");
		System.out.println("User1 recent played list:"+getPlayList("User1", "s4"));
		System.out.println("User1 recent played lists:"+songsPlayListMap);
		System.out.println("#################Test2########User1 played S2#########################");
		System.out.println("User1 recent played list:"+getPlayList("User1", "s2"));
		System.out.println("User1 recent played lists:"+songsPlayListMap);
		System.out.println("#################Test3########User1 played S1#########################");
		System.out.println("User1 recent played list:"+getPlayList("User1", "s1"));
		System.out.println("User1 recent played lists:"+songsPlayListMap);
	}
	
	public static List<String> getPlayList(String user,String playedSong)
	{
		resultantList = new ArrayList<String>(3);
		List subList = songsPlayListMap.get(user).subList(1, songsPlayListMap.get(user).size());
		playsit = new ArrayList<String>(3);
		resultantList.addAll(subList);
		resultantList.add(playedSong);
		playsit.addAll(resultantList);
		songsPlayListMap.put("User1", (ArrayList<String>) playsit);
		return resultantList;		
	}

}
