import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner (System.in);

        //array of 5 numbers
        int [] numbers = {2 ,4, 6, 8, 10};

        System.out.println("Enter a number to search, we will find out if the number exist in array.");
        // read the user input
        int userNumber = reader.nextInt();

        int valueFind = 0;

        for (int i=0; i< numbers.length; i++){
            if (userNumber == numbers[i]) {
                valueFind++;
            }
        }

        if (valueFind !=0) {
            System.out.println("Value " + userNumber + " is found in this array.");
        } else {
            System.out.println("Value " + userNumber + " is not found in this array.");
        }


    }
}
