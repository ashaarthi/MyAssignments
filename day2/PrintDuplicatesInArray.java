package week1.day2;

import java.util.Arrays;



public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {3,7,8,7,8,9,0};
Arrays.sort(nums);
for(int i=0;i<nums.length-1;i++)
{
if(nums[i]==nums[i+1])	
{System.out.println(nums[i]);}
}

	}

}
