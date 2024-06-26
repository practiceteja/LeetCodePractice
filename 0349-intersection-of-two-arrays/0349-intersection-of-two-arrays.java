class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }
        HashSet<Integer> temp = new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num)) 
                temp.add(num);
        }
        int[] res = new int[temp.size()];
        int i = 0;
        for(int num:temp){
            res[i] = num;
            i++;
        }
        return res;
        
        
    }
}