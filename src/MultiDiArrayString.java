public class MultiDiArrayString {
    public static void main(String[] args) {
        // declare and assign the 2D arrays of 2 rows and 3 col
        String [][] names = {
                {"Ameena", "Bobby", "Dylan"}, // first row of data
                {"Charles", "Harry"} // second row of data
        };

        // print all data
        for (int i =0; i < names.length; i++) { // index of the row
            for (int j =0; j < names[i].length; j++) { // index of the col
                System.out.print(names[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
