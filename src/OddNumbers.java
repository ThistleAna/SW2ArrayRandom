import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        //1.  declare an array with length 10
        int[] numbers = new int[10];
        //2.  create Scanner object
        Scanner input = new Scanner (System.in);
        //3.  get user input, store in array
        System.out.println("Enter 10 integer values: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        //4.  print the values of the array
        System.out.println("You've entered ");
        for (int i: numbers) {
            System.out.println(i);
        }
        //5.  print only the odd values
        System.out.println("The odd values ");
        for (int i: numbers) { // for each
            if (!(i%2==0)){
                System.out.println(i);
            }
        }
    }
}
