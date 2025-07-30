class Solution {
    public int[] sortArray(int[] nums) {
        heapSort(nums);
        return nums;
    }

    private void heapSort(int[] nums) {
        int n = nums.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            swap(nums, 0, i);

            // Call max heapify on the reduced heap
            heapify(nums, i, 0);
        }
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // left child index
        int right = 2 * i + 2;    // right child index

        // If left child is larger than root
        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(nums, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(nums, n, largest);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Example Usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {5, 2, 3, 1};
        int[] nums2 = {5, 1, 1, 2, 0, 0};

        nums1 = solution.sortArray(nums1);
        nums2 = solution.sortArray(nums2);

        // Print sorted arrays
        printArray(nums1);
        printArray(nums2);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    
    }
}