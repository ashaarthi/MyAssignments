package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n1= {3,2,17,9,4};
int[] n2= {1,5,8,9,5};
for(int i=0;i<n1.length;i++)
{
	for(int j=0;j<n2.length;j++)
	{
		if(n1[i]==n2[j])
		{System.out.println(n1[i]);}
		
	}
}

	}

}
