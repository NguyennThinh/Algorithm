package Sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[]  arr = {5,1,6,3,2,1,8,6,9,5,7,4,6,2};



        for (int i =0; i < arr.length-1; i++){


            for (int j = 0; j < arr.length-i-1; j++){

                if (arr[j] > arr[j+1]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }


            }
        }

        for (int n : arr){
            System.out.println(n);
        }

    }



}
