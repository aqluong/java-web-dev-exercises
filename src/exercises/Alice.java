package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to find?");
        String search = input.nextLine();

        if (aliceSentence.toLowerCase().contains(search.toLowerCase())) {
            System.out.println("Found the word you're looking for");
            int index = aliceSentence.indexOf(search);
            int length = search.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = aliceSentence.replace(search, "");
            System.out.println(modifiedSentence);

        } else {
            System.out.println("not found");

        }
    }
}