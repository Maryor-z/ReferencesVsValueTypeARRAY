package com.maryor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;
        myIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherValue = " + anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        anotherArray[4] = 4;

        System.out.println("after change in myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change in anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};

        modifyArray(myIntArray);
        System.out.println("after change in myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change in anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
