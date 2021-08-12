import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// This Solution has passed all test cases.
// Created By: Nwaobiala Uchechi

public class Solution {
	
	public static ArrayList <Integer> prices = new ArrayList<Integer> ();


	public static void main(String[] args) throws FileNotFoundException {
		
	//	File input = new File ("input.txt");
	//	Scanner sc = new Scanner (input);
	
	 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in))); // Input method used in Google Kickstart
		
		int T = sc.nextInt();
		
		for (int i=1; i<=T; i++) {  // Looping T = number of test cases
			
			int N = sc.nextInt();
			int B = sc.nextInt();
			int count = 0;
			int sum = 0;
			
		for (int k = 1; k<=N; k++) { // Loop to add N houses to a list: prices
			
			int cases = sc.nextInt();
			prices.add(cases);
		 }
		
		
		Collections.sort(prices); // sort prices
		
		if (prices.get(0) > B) {  // Condition 1:
			
			System.out.println("Case #" +i+ ": " +0);
			
		} else if (prices.get(0) == B) { // Condition 2:
			
			System.out.println("Case #" +i+ ": " +1);
			
		} else {                      // Condition 3:
		for (Integer j: prices) {
			sum = sum + j;
			
			
			if (sum <= B) {
				count ++;
			}
			
		}	 
			System.out.println("Case #" +i+ ": " +count); 
		
		
		} 
		    prices.clear();
		   
			if (sc.hasNext()==false) {
	
			sc.close();	
		}			}
			
		
}
}
