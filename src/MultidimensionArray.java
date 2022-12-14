public class MultidimensionArray {
    public static void main(String[] args) {
        // declare and assign the 2D arrays of 2 rows and 3 col
        int [][] numbers = {
                {90, 75, 80}, // first row of data
                {70, 56, 75} // second row of data
        };

        // print all data
        for (int i =0; i < numbers.length; i++) { // index of the row
            for (int j =0; j < numbers[i].length; j++) { // index of the col
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(" ");
        }






    }
}
