package Sort;

public class InsertionSort {
    public static void main(String[] args) {

        int[]  arr = {5,1,6,3,2,1,8,6,9,5,7,4,6,2};


        for (int i =1; i < arr.length; i++){

            int key = arr[i];
            int index = i-1;

            while (index >=0 && arr[index]> key){

                arr[index+1] = arr[index];
                index--;


            }
            arr[index+1] = key;
        }

        for (int n : arr){
            System.out.println(n);
        }
    }
}
