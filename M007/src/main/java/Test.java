import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7};

        int[] reversed=new int[numbers.length];
        //reverse array
        for (int i = numbers.length; i>=0 ; i--) {
            reversed[numbers.length-1]=numbers[i];
        }

        System.out.println("Arrays.toString(sorted) = " + Arrays.toString(reversed));
    }


}
