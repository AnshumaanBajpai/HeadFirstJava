/* This is a script to generate random cool looking phrases as used for marketing
typical products.*/

public class PhraseOMatic {
	public static void main(String[] args) {
		// We create three sets of words to choose from
		
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
		 "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
		"critical-path", "dynamic"};
		
		String[] wordListTwo = {"empowered", "sticky", " value-added", "oriented",
		 "centric", "distributed", "clustered", "branded", "outside-the-box",
		  "positioned", "networked", "focussed", "leveraged", "alligned",
		   "targeted", "shared", "cooperative", "accelerated"};
		   
		String[] wordListThree = {"process", "tipping point", "solution",
		 "architecture", "core competency", "strategy", "mindshare", "portal",
		"space", "vision", "paradigm", "mission"};
		 
		 // fin out how many words are in each list
		 int oneLength = wordListOne.length;
		 int twoLength = wordListTwo.length;
		 int threeLength = wordListThree.length;
		 
		 // generate three random numbers
		 int rand1 = (int) (Math.random() * oneLength);
		 int rand2 = (int) (Math.random() * twoLength);
		 int rand3 = (int) (Math.random() * threeLength);
		 
		 // now build a phrases
		 String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		 
		 //Print out the phrase
		 System.out.println("What we need is a " + phrase);
	}
}