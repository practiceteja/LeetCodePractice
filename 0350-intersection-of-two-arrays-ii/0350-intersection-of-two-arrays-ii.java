class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[temp.size()];
        int k = 0;
        for(int num: temp){
            res[k] = num;
            k++;
        }
        return res;
    }
}