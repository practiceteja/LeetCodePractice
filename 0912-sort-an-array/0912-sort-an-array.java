class Solution {
    
    public void ms(int[] nums, int low, int high){
        if(low >= high) return;
        int mid = (low+high) / 2;
        ms(nums, low, mid);
        ms(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    
    public void merge(int[] nums, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
    public int[] sortArray(int[] nums) {
        ms(nums, 0, nums.length-1);
        return nums;
    }
}