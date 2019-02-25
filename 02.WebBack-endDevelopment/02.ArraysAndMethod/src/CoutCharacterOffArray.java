public class CoutCharacterOffArray {
    public static void main(String[] args) {
        String[] arr = {"a","c","d","a","A"};
        String character ="a";
        int cout=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==character) {
                cout+=1;
            }
        }
        System.out.println(cout);

    }
}
