class Solution {
    public int removeDuplicates(int[] nums) {
    int i =0;
        // int ele= nums[0];
        for(int ele : nums)
        {
            if(i==0 || i==1 || nums[i-2] != ele)
            {
                nums[i] = ele;
                i++;
            }
        }
    return i ;
    }
}