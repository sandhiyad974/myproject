package newteAM;
import java.util.Scanner;
class Automarphic_Number {
	public static void main(String args[]) {
		System.out.print("Enter number :");
		Scanner sn=new Scanner(System.in);
		int number=sn.nextInt();
		int temp=10;
		if (temp>=number) {
			if ((number*number)%temp==number) {
				System.out.println("automarphic number");
			}
			else {
				System.out.println("not automarphic number");
			}
		} 
		else if (temp<=number) {
			if ((number*number)%(temp*10)==number) {
				System.out.println("automarphic number");
			} else {
				System.out.println("not automarphic number");
			}
		}
	}
}
