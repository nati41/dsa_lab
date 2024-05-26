public class max {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int maxElement = findMax(numbers);
        System.out.println("The maximum element is: " + maxElement);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
