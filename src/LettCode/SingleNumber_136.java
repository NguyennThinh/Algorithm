package LettCode;

import java.util.*;

public class SingleNumber_136 {

    public static void main(String[] args) {
            int[] nums = {2,2,1};

        System.out.println(singleNumber(nums));;


    }
    public static int singleNumber(int[] nums) {
        int num = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            num = num ^ nums[i];// Toán tử xor trong java
        }
        return num;
    }
}
