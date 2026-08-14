import java.util.ArrayList;
import java.util.Scanner;

public class practical3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String inputLine=scanner.nextLine();
		String[]words=inputLine.split(" ");
		ArrayList<String>wordsStringWithB=new ArrayList<>();
		for(String word:words) {
		if(word.toLowerCase().startsWith("b")) {
			wordsStringWithB.add(word);
			
		}
	}
		ArrayList<String>wordsEndingWithED=new ArrayList<>();
		for(String word:words) {
			if(word.toUpperCase().endsWith("ED")) {
				wordsEndingWithED.add(word);
			}
		}
		System.out.println("Words starting with 'b': "+wordsStringWithB);
		System.out.println("Words starting with 'ED': "+wordsEndingWithED);

	}}