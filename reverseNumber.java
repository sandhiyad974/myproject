package newteAM; 

import java.util.Scanner;
class ReverseNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number=input.nextInt();
		int num = 0;
		for(;number!=0;) {
			num=(num*10)+(number%10);
			number=number/10;
			
		}
		System.out.println("Rever of the number : "+num);
	}

}
