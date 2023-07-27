package week1.day2;

import java.util.Arrays;



public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,6,8,9,6,2,1};
Arrays.sort(a);
for(int i=a[0];i<a.length;i++)
	if(i!=a[i]) {
		System.out.println(a[i]);
		break;
		
	}
	}

}
