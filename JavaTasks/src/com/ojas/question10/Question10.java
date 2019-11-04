package com.ojas.question10;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of ports");
		int n = sc.nextInt();
		int i = 0, j = 0;
		int[][] portWays = new int[n][n];
		while (i < n) {
			while (j < n) {
				portWays[j++][i] = sc.nextInt();
			}
			i++;
		}
		
		System.out.println("enter the port no's");
		int p1 =sc.nextInt();
		int p2 = sc.nextInt();
		if(portWays[p1-1][p2-1]==0)
			System.out.println("There is no route");
		else System.out.println("There is a route");
	}
}
