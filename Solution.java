package leetcode75;

import java.util.Arrays;

// 三路快排
// 时间复杂度 O（n)
//空间复杂度 O (1)
public class Solution {
	
	public void sortColors(int[] nums){
		
		int zeros = -1; // nums[0.....zero] = 0; 前闭后闭的区间设置成-1；
		int two = nums.length; // nums[two...n-1] == 2
		for ( int i = 0 ; i < two;){
			if ( nums[i] == 1){
				i ++;
			}else if ( nums[i] == 2){
				two --;
				int temp = nums[i];
				nums[two] = temp;
				nums[i] = nums[two];
			}else { // nums[i] ==0
				assert ( nums[i] == 0);
				zeros ++;
				int temp = nums[i];
				nums[zeros] = temp;
				nums[i] = nums[zeros];
				i ++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tst = { 1,0,1,2,0,1,2,1,0};
		Solution testSolution = new Solution();
		testSolution.sortColors(tst);
		System.out.println(Arrays.toString(tst));
	}

}
