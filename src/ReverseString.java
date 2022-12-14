import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("This program will reverse a name.");

        Scanner reader = new Scanner (System.in);
        System.out.println("Enter a name!");
        char [] letters = reader.nextLine().toCharArray(); // reading the char and fill the array

        for (int i=0; i <letters.length; i++){
            System.out.print(letters[i]);
        }

        // use for loops to read from index length-1 until index 0 - OBAMA - AMABO
        System.out.println("\nThe name printed in reverse : ");
        for (int j=letters.length-1; j>=0; j--) {
            System.out.print (letters[j] + " ");
        }
    }
}
