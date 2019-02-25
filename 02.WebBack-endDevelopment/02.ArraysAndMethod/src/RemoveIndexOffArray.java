public class RemoveIndexOffArray {
    public static void main(String[] args) {

        int[] arr = {12, 2, 1, 3, 1, 31, 34, 45, 26, 1, 23, 42};
        int x = 1;
        int countFinded = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                countFinded ++;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - countFinded] = 0;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
