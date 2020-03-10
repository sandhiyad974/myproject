package newteAM;

import java.util.Scanner;
class addEven {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=input.nextInt();
		int sum=0;
		int temp;
		while(number>0)
		{
			temp=number%10;
			if(temp%2==0)
			{
				sum=sum+temp;
			}
			number=number/10;
		}
		System.out.println("Sum : "+sum);	
	}
}
