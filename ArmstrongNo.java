package armstrong;

public class ArmstrongNo {
	public static boolean isArmstrong(int n) {
		//153<-- count digit<--3<--raised to(1^3+5^3+3^3)<--addition will be 153
		int temp=n; int count=0;int sum=0;
		//To count the no.of digits
		while(n!=0) {
			n=n/10;
			count++;
			
		}
		temp=n;
		while(temp>0) {
			int lastdigit=temp%10;
			int pro=1;
			for(int i=1;i<=count;i++) {
				pro=pro*lastdigit;
			}
			sum=sum+pro;
			temp=temp/10;
		}
		if(sum==n) {
			return true;
					
		}else {
			
			return false;
		}
		
	
	}
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
