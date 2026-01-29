package src;

import java.util.Random;

public class RemoveRandomElement {
    public static int[] removeRandom(int[] arr) {
        if (arr.length == 0) return arr;
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }
}