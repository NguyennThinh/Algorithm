package LettCode;

public class LetCode108 {


    public static void main(String[] args) {

    }


    public TreeNode sortedArrayToBST(int[] nums) {
            int mid  = nums.length/2-1;

            TreeNode root = new TreeNode(nums[mid]);
        int left =0;
        int right = nums.length-1;
            return construstBST(nums, left, right);
    }

    public TreeNode construstBST(int[] arr, int left, int right){


        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left =  construstBST(arr, left, mid -1);
        root.right = construstBST(arr, mid+1, right);
        return root;
    }
   static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
