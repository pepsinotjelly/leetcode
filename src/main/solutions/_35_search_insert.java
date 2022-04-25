class _35_search_insert {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int res = n;
        while (low <= high) {
            int mid = ((high - low) / 2) + low;
            if (target <= nums[mid]) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
