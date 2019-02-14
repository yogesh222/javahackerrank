import java.util.*;
class looping
{
	public static void main(String args[])
	{
		int n,a,i;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number");
		n = sc.nextInt();
		if(n <= 20 && n >= 1)
		{
		for(i=1;i<=10;i++)
		{
			a = n * i;
			System.out.println(n+" x "+i+" = "+a);
		} 
		}
		
	}
}
