package week1.day2;

public class PrimeNumberAssignment {

	public static void main(String[] args) {
		int input = 13;
		Boolean A=false;
		for (int i = 2; i < input/2; i++) 
		{
			int j=input%i;
			if(j==0)
				A=true;
			break;
		}
			if(A)
				System.out.println("not a prime");
			else
				
			{
				System.out.println("prime number");
		}
	}
	

}
