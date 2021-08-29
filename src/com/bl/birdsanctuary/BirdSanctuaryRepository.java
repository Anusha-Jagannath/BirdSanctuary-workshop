package com.bl.birdsanctuary;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryRepository {

	private static BirdSanctuaryRepository instance;
	private Set<Bird> birdList = new HashSet<>();
	
	private BirdSanctuaryRepository() {	
	}
	
	static synchronized BirdSanctuaryRepository getInstance() {
		if(instance == null)
			instance = new BirdSanctuaryRepository();
		return instance;
			
	}
	
	public void add(Bird bird){
		
		birdList.add(bird);
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);
		
	}
	
	public Bird getBird(String name){
		
		for(Bird bird: birdList) {
			if(bird.name.equals(name)) {
				return bird;
			}
		}
		return null;
	}
	
	public Set<Bird> getAllBirds() {
		return birdList;
	}
}

