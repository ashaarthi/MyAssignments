package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=81;
int count=0;

	for(int i=2;i<=n;i++)
		if(n%i==0)
		{
			count++;
		}
if(count==2) {System.out.println("Prime Number");}
else {System.out.println("Not a Prime Number");}
	}

}
