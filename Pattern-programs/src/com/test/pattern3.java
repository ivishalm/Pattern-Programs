package com.test;
/*
	*
	**
	***
	****
	*****
	****
	***
	**
	*

*/
public class pattern3 {

	public static void main(String[] args) {
			
		int k=0;
		for (int i = 1; i <=9; i++) {
			
			if(i<=5)
				k++;
			else
				k--;		
			for(int j = 1; j <=i; j++) {
				
				if(j<=k){					
					System.out.print("*");	 
				}	
			}
			System.out.println();
		}
		
	}
	
}
