
/**
 * quick sort
 * 
 * @author zhiyuanli
 *
 */
public class QuickSort {

	public void quicksort(int[] nums) {
		quicksort(nums, 0, nums.length - 1);
	}

	private void quicksort(int[] nums, int left, int right) {
		if (left < right) {
			int index = partition(nums, left, right);
			quicksort(nums, left, index - 1);
			quicksort(nums, index + 1, right);
		}
	}

	private int partition(int[] nums, int left, int right) {
		int pivotIndex = (left + right) / 2;
		int pivot = nums[pivotIndex];
		swap(nums, pivotIndex, right);
		int storeIndex = left;
		for (int i = left; i < right; i++) {
			if (nums[i] <= pivot) {
				swap(nums, storeIndex, i);
				storeIndex++;
			}
		}
		swap(nums, storeIndex, right);
		return storeIndex;
	}

	private void swap(int nums[], int left, int right) {
		if (left == right)
			return;
		int tmp = nums[right];
		nums[right] = nums[left];
		nums[left] = tmp;
	}

	public static void main(String[] args) {
		int[] nums = { 6, 5, 3, 1, 8, 7, 2, 4, 4, 4, 4 };
		QuickSort qs = new QuickSort();
		qs.quicksort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
