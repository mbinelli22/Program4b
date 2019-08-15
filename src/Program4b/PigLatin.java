package Program4b;
//Michael Binelli
import java.util.Scanner;
public class PigLatin {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String playGame;
		String word;
		String pigLatinWord;
		
		System.out.println("Welcome to Pig Latin Translator");
		System.out.println("-------------------------------");
		System.out.println();
		
		do {
			System.out.print("Press Y to play, press N to be lame");
			playGame = stdIn.next();
		}
		while(!(playGame.equalsIgnoreCase("Y") || playGame.equalsIgnoreCase("N")) );
		
		if(playGame.equalsIgnoreCase("Y")) {
			System.out.println("Please enter a word you would like translated to pig latin:");
			word = stdIn.next();
			
			String lHalf = "";
		    String rHalf = "";
		    boolean firstVowel = false;
		    for(int i = 0; i < word.length(); i++) {
		    	char check = word.charAt(i);
		        if ( (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') )
		        {
		          firstVowel = true;
		        }

		        if ( !firstVowel )
		        {
		          lHalf += check;
		        }       
		        else
		        {
		          rHalf += check;
		        }
		    }
		    pigLatinWord = lHalf + rHalf + "ay";
		    System.out.print("The word, " + word + " in pig latin is: " + pigLatinWord);
		}
		else {
			System.out.print("Don't be lame...");
		}
		
		stdIn.close();
	}
	
}
