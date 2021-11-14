//Binary Search

import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch {
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Input a phrase: ");
        String phrase = keyboard.nextLine();

        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");

        ArrayList<letterCounter> list = new ArrayList<letterCounter>();
        letterCounter zero = new letterCounter(1, phrase.charAt(0));
        list.add (zero);

        for(int i=1; i<phrase.length(); i++) { // adds letters of the phrase to the arraylist, making sure no letter will repeat in the list
			char currentLetter = phrase.charAt(i);
			boolean different = true;
			int j=0;
			while(j<list.size() && different==true) {
				if(currentLetter == list.get(j).getLetter()) {
					different = false;
					list.get(j).setCounter(list.get(j).getCounter()+1);
				}
				j++;
			}
			if(different==true) {
				letterCounter obj = new letterCounter (1, currentLetter);
				list.add(obj);
			}
		}
		for(int i=0; i<list.size(); i++) { // bubble sort algorithm to sort arraylist in alphabetical order (ascending)
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).compareTo(list.get(j))==1) {
					char tempLetter = list.get(i).getLetter();
					int tempCount = list.get(i).getCounter();
					list.get(i).setLetter(list.get(j).getLetter());
					list.get(i).setCounter(list.get(j).getCounter());
					list.get(j).setLetter(tempLetter);
					list.get(j).setCounter(tempCount);
				}
			}
		}
		
		System.out.println("Sorted Phrase (with letter occurences): " + list);

		System.out.print("Input a letter to check for: ");
		char response = keyboard.next().toLowerCase().charAt(0);
		letterCounter check = new letterCounter(1, response);

		//Binary Search begins here
		int min = 0;
		int max = list.size()-1;
		int position = -1;
		while (min<=max){
			int middle = (min + max) / 2;
			if (check.compareTo(list.get(middle))==0){
				position = middle;
				min += max;
			}
			else if (check.compareTo(list.get(middle))==1){
				min = middle + 1;
			}
			else{
				max = middle - 1;
			}
		}
		if (position==-1){
			System.out.println("Letter not found.");
		}
		else{
			System.out.println("Position of first occurence of '" + response + "' in sorted phrase: " + position);
		}
			
		keyboard.close();
    }
}
