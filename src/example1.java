import java.sql.SQLOutput;

public class example1 {
    public static void main(String[] args) {
        String [] car = {"Volvo", "BMW", "Ford", "Mazda"};

        // the size of array using length
        System.out.println(car.length); // output is the length of the array car

        // call the element of the array
        System.out.println(car[0]);
        System.out.println(car[1]);
        System.out.println(car[2]);
        System.out.println(car[3]);

        // call all the elements in the array using for loops
        for (int i=0; i<car.length; i++){
            System.out.println(car[i]);
        }

        // for each, to call all the elements
        for (String x : car) {
            System.out.println(x);
        }


        System.out.println(car.length); // question 3
    }
}
