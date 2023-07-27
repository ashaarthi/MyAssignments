package week1.day2;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data= {3,8,9,4,7};
int length= data.length;
Arrays.sort(data);
System.out.println("The Second largest number is" +"  "+data[length-2]);
	

	}

}
