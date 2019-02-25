public class FindMindIndexOfArrays {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 54, 65, 32, 94, 21, 43};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]+" at position "+(index+1));

    }
}