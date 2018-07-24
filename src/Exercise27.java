import java.util.ArrayList;
import java.util.Arrays;

public class Exercise27 {

    public static void main(String[] args){
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(10);
        numberList.add(2);
        numberList.add(8);
        numberList.add(7);
        printIntArray(numberList);
    }
    public static void printIntArray(ArrayList<Integer> intArray) {
        System.out.println(intArray);
    }
}
