/* Here we are wrinting a program
for childeren's favorite "99 bottles of beer."*/

public class BeerSong {
	
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			
			System.out.print(beerNum + " " + word + " of beer on the wall, ");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.print("Take one down ");
			System.out.print("and Pass it around, ");
			beerNum = beerNum - 1;

			if (beerNum == 	1) {
				word = "bottle"; // singular as in One bottle
			}
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
				System.out.println("");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			} // end else
		} // end while loop
	} //end main method
} //end class