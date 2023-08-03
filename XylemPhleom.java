package xylemPhloem;

public class XylemPhleom {
	public static String isXylemPhleom(int n) {
		//13338= first and last digit sum1=9 and middle 3 digits sum2=9 sum1=sum2
		
		int Count1 =0;int sum1=0; int sum2=0; int count2=0; int temp=n;
		//To count the numbers
		while(n!=0) {
			n=n/10;
			Count1++;
			
		}
		//To perform the sum operation
		while( temp<0) {
		int lastdigit=temp%10;
		count2++;
		if(count2==1 || count2==Count1) {
			
			sum1=sum1+lastdigit;
			
		}else {
			
			sum2+=lastdigit;
			
		}
		temp=temp/10;
		
		}
	
		if (sum1==sum2) {
			return "The Number is Xylem";
			
		}else {
			
			return "The Number is Phleom";                    
		}
	}
	public static void main(String[] args) {
		System.out.println(isXylemPhleom(1338));
	}
	

}
