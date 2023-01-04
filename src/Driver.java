public class Driver {
    // guess the output of the following program
    public static void main(String[] args) {
        String [] strArr = new String[10]; // array of 10 elements, index goes from 0 to 9

        for (int i = strArr.length-1; i>=0; i--) {
            System.out.println(" index i = " + i);
            strArr[i]="b"+ (i-1);
        }

        System.out.println("Value: " + strArr[0]); // -1
        System.out.println("Value: " + strArr[1]); // 0
        System.out.println("Value: " + strArr[2]); // 1
        System.out.println("Value: " + strArr[3]);// 2
        System.out.println("Value: " + strArr[4]); // 3
        System.out.println("Value: " + strArr[5]); // 4
    }
}
