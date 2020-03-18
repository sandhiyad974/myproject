package newteAM;
import java.util.Scanner;
class Sorting {
	public static void main(String[] args) {
		int noOfEle, i, j, temp;  
		int arr[] = new int[20];  
		Scanner scan = new Scanner(System.in);  		         
		System.out.print("Enter number of elements in array < 20 : ");  
		noOfEle = scan.nextInt();  
		System.out.print("Enter Array Elements : ");  
		for(i=0; i<noOfEle; i++)  
		{  
			arr[i] = scan.nextInt();  
		}  
		for(i=0; i<noOfEle; i++)  
		{  
			for(j=i+1; j<noOfEle; j++)  
		    	{  
				if(arr[i] > arr[j])  
		        	{  
					temp = arr[i];  
		            		arr[i] = arr[j];  
		           		arr[j] = temp;  
		        	}  
		   	 }  
		}  
		
		for(i=0; i<noOfEle; i++)  
		{  
			System.out.print(arr[i]+ "  ");  
		}  
	}  
}  
