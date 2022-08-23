package com.clayfin;

import java.util.Scanner;

public class UseOfDelimiter {

	public static void main(String[] args) {
		Scanner scn = new Scanner("hello-this-is-navya working in clayfin");
		scn.useDelimiter("-| ");
		while(scn.hasNext()) {
			System.out.println(scn.next());
		}
	
	}

}