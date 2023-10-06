package LettCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetCode_349 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        for (int n : intersection(nums1, nums2)){
            System.out.println(n);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {



        Set<Integer> targetNum1 =  Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> targetNum2 =  new HashSet<>();



        for (int i =0; i < nums2.length; i++){
            if (targetNum1.contains(nums2[i])){
                targetNum2.add(nums2[i]);
            }
        }

        int[] ans = new int[targetNum2.size()];

        int index=0;
        for (int n : targetNum2){

            ans[index] = n;
            index++;

        }

        return ans;


    }
}
