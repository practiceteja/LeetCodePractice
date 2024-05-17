class Solution {
    public int pivotIndex(int[] nums) {
        //int totalSum = 0;
        //for(int j = 0; j < nums.length; j++){
          //  totalSum  += nums[j];
        //}
        //int leftSum = 0, rightSum = totalSum  - nums[0];
        //int i = 1;
        //while(leftSum != rightSum && i < nums.length){
         //   leftSum += nums[i-1];
          //  rightSum -= nums[i];
         //   i++;
        //}
        //int ans = (leftSum == rightSum) ? i-1 : -1;
        //return ans;
         int sum = 0;
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        for(int j=0 ; j < nums.length ; j++){
            sum -= nums[j];
            if(sum == temp)return j;
            temp += nums[j];
        }
        return -1;
    }
}