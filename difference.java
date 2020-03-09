package newteAM;
import java.util.Scanner;
class Difference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("No.Of.Elements : ");
		int number=input.nextInt();
		System.out.print("Start : ");
		int start=input.nextInt();
		System.out.print("Difference : ");
		int total_Numbers=input.nextInt();
			System.out.print(start);
				for(int i=1;i<number;i++)
				{
					System.out.print((start+(total_Numbers*i))+" , ");
				}
		}

}
