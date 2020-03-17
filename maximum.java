package newteAM;
import java.util.Scanner;
class GetMaximum {
	   public static void main(String[] args){ 
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the number : ");
	        int num=input.nextInt();
	        int[] arr = new int[10];
	        while(true){
	            if(num==0){
	                break;
	            }
	            else {
	            	int val = num%10;
	        	arr[val]++;
	        	num /= 10;
	            }
	        }
	        for(int i=9; i>=0; i--){
	            for(int j=0; j<arr[i]; j++){
	                System.out.print("The highest number : "+i);
	            }
	        }
	   }
  } 
