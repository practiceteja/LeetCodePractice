class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0, r = nums.length - 1;
        for(int i=nums.length - 1; i >= 0; i--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                ans[i] = nums[l]*nums[l];
                l++;
            }else{
                ans[i] = nums[r]*nums[r];
                r--;
            }
        }
        return ans;
    }
}