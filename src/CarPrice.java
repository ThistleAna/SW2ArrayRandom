/* Create an array to store these second-hand car prices :
12000, 34000, 56000, 15450, 45000 print them.
Update the value 12000 to 12670 and print all the array elements.
 */
public class CarPrice {
    public static void main(String[] args) {
    int [] carValues = {12000, 34000, 56000, 15450, 45000}; // create array

    for (int i=0; i<carValues.length; i++){ // print the array using for loop
        System.out.println(carValues[i]);
    }

    // update the index 0
        carValues[0] = 12670;
        System.out.println("Updated price : ");
        for (int i=0; i<carValues.length; i++){
            System.out.println(carValues[i]);
        }


    }
}
