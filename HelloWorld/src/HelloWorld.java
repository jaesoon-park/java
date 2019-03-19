
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum = 0;
	int num = 0;
	
	int n;
	
	while(sum < 100) {
		sum++;
		n = sum%2;
		if(n!=0) {
			num = num + sum;
		}
	}
	
	System.out.println(num);
	}
}
	

