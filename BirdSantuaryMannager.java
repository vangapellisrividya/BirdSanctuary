package com.bl.birdsantuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSantuaryMannager {
	List<Bird> birdList = new ArrayList<Bird>();
	static private BirdSantuaryMannager instance;
	
	private  BirdSantuaryMannager() {
		
	}
	public synchronized static BirdSantuaryMannager getInstance() {
		if(instance == null )
			instance = new BirdSantuaryMannager();
		return instance;
		
	}
	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
	}

	public void printFlyable() {
		for (int i = 0; i < birdList.size(); i++) {
			if ( birdList.get(i).isFlyable == true) {
				birdList.get(i).fly();
			}
		}
	}

	public void printSwimmable() {
		for (int i = 0; i < birdList.size(); i++) {
			if (birdList.get(i).isSwimmable == true) {
				birdList.get(i).swim();
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < birdList.size(); i++) {
			System.out.println(birdList.get(i));
		}
	}

//	public void print() {
//		for (Bird i : birdList) {
//			System.out.println(i);
//		}
//	}

	public Bird getBird(String id) {
		for (int i = 0; i < birdList.size(); i++) {
			if (birdList.get(i).id.equals(id)) {
				return birdList.get(i);
			}

		}
		return null;

	}
}
