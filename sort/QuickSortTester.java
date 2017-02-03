
/**
 * quick sort Tester
 * 
 * @author zhiyuanli
 *
 */
public class QuickSortTester {

	public static void main(String[] args) {
		int[] nums = { 6, 5, 3, 1, 8, 7, 2, 4, 4, 4, 4 };
		QuickSort qs = new QuickSort();
		qs.quicksort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
