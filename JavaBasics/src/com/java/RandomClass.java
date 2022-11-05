package com.java;

import java.time.Instant;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
//		Random rng = new Random(System.currentTimeMillis());   
//		long result = rng.nextLong() % 900000000 + 0 + 1000000000 + 0;
		int i = 0;
		while(i < 10) {
		long instant = Instant.now().toEpochMilli();

    	//long value = instant.getEpochSecond();
    
		System.out.println(instant);
		i++;
		}
	}
}
