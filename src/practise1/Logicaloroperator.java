package practise1;

public class Logicaloroperator {
	
	public static void main(String[] args) {
		/* T T=T, T F=T, F T=T, FF=F */
		
		int a=10;
		int b=20;
		
		
		if((a<b) || (b<a))
		{
			System.out.println("a is a small number");
		}
		if((a==10) || (b==20))
			
		{
			System.out.println("a and b are equal");
		}
		if ((a>b) || (a<b))
			
		{
			System.out.println("b is a big number");
		}
		if(( a>b)|| (b<a))
		{
			System.out.println("False");
		}

		
	}
}
