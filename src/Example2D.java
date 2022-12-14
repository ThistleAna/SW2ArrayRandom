public class Example2D {
    public static void main(String[] args) {
        int [][] integers = new int[2][2]; // int [row][col]

        integers[0][0] = 3;
        integers[0][1] = 5;
        integers[1][0] = 10;
        integers[1][1] = 2;

        for (int i=0; i<integers.length; i++) { // access the row index
            for (int j=0; j<integers[i].length; j++) { // access the col index
                System.out.println(integers[i][j]);;
            }
        }
    }
}
