package newteAM;

import java.util.Scanner;
class addEven {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=input.nextInt();
		int sum=0;
		int even;
		while(number>0)
		{
			even=number%10;
			if(even%2==0)
			{
				sum=sum+even;
			}
			number=number/10;
		}
		System.out.println("Sum : "+sum);	
	}
}
