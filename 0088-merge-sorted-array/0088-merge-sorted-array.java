class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int[] res = new int[m+n];
        for(int i=0; i < m; i++){
            res[index] = nums1[i];
            index++;
        }
        for(int i=0; i < n; i++){
            res[index] = nums2[i];
            index++;
        }
        Arrays.sort(res);
        for(int i=0; i < m+n; i++){
            nums1[i] = res[i];
        }
    }
}