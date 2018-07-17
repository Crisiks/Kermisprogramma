package kermis;

import java.util.Scanner;

class Kermisprogramma {

	public static void main(String[] args) {
		int[] IngevuldeNummer = new int [6];
		int i = 0;
		
		attractieOproepen(IngevuldeNummer);
	//	System.out.println(IngevuldeNummer[i]);


	public static int attractieOproepen(int [] ingevuldeNummer){
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Welke attractie wil je oproepen?");
		ingevuldeNummer[i] = input.nextInt();
		return ingevuldeNummer[i];
	}	


}

class Attractie {
	
}

class Botsautos {
	
}

class Spin {
	
}

class Spiegelpaleis {
	
}

class Spookhuis {
	
}

class Hawaii {
	
}

class Ladderklimmen {
	
}