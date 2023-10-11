package Sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[]  arr = {5,1,6,3,2,1,8,6,9,5,7,4,6,2};

        for (int i =0; i < arr.length; i++){
            int key = i;

            for (int j =i; j < arr.length; j++){
                if (arr[key] > arr[j]){
                    key = j;
                }
            }

            int temp = arr[key];
            arr[key] = arr[i];
            arr[i] = temp;

        }

        for (int n : arr){
            System.out.println(n);
        }
    }
}
