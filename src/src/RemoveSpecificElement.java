package src;

public class RemoveSpecificElement {
    public static int[] removeElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) count++;
        }
        int[] newArr = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != element) newArr[j++] = arr[i];
        }
        return newArr;
    }
}