package Search;



public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7,8,9};

        int left = 0;
        int right = arr.length-1;
        int n = 10;


        int ans = binarySearch(arr,left, right, n);

        System.out.println(ans);

    }

    private static int binarySearch(int[] arr, int left, int right, int n) {

        int mid = (left+ right)/2 -1;
        if (arr[mid] == n){
            return  mid;
        }
        if (left >= right){
            return -1;
        }else {
            return n < arr[mid] ? binarySearch(arr, left, mid-1, n) :  binarySearch(arr, mid-1, left, n);
        }



    }
}
