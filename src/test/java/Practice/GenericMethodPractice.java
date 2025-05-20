package Practice;

public class GenericMethodPractice {

	public static void main(String[] args) {//Caller function
		
		int sum=add(30,40);
		System.out.println(sum);
		System.out.println(add(sum,30));
		System.out.println(add(40,sum));
		System.out.println(add(70,80));
	}
	
	public static int add(int a, int b)//Called function - generic - reusable
	{
		int c=a+b;
		return c;
	}

}
