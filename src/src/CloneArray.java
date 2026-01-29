package src;

public class CloneArray {
    public static int[] cloneArray(int[] original) {
        int[] cloned = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            cloned[i] = original[i];
        }
        return cloned;
    }

    // أضف هذه الدالة للاختبار
    public static void main(String[] args) {
        System.out.println("Testing CloneArray...");

        int[] testArray = {1, 2, 3, 4, 5};
        int[] result = cloneArray(testArray);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}