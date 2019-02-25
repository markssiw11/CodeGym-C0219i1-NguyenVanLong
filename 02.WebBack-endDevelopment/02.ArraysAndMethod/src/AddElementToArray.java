public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, 3, 41, 1, 34, 45, 56, 23, 42};
        int x = 30;
        int index = 6;
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("position you want insert not exit");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = x;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}