class Solution {
    public int search(int[] nums, int target) {
       
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int mid = (left + right)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
            
        }
        int pivot = left;
        left = 0;
        right = nums.length-1;
        if(target >= nums[pivot] && target <= nums[right]){
            left = pivot;

        }
        else{
            right = pivot-1;
        }
        while(left <= right){
            int m  = (left+right)/2;
            if(nums[m] == target){
                return m;

            }
            else if(nums[m] < target){
                left = m+1;
            }
            else {
                right = m-1;
            }
        }
        return -1;
    }
}
