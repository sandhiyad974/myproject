package newteAM;

import java.util.Scanner;
class addEven {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=input.nextInt();
		int sum=0;
		int digit;
		while(number>0)
		{
			digit=number%10;
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			number=number/10;
		}
		System.out.println("Sum : "+sum);	
	}
}
