package practise1;

public class Logicalandopertor {
public static void main(String[] args) {
	char persongender='F';
	int age=20;
	
	if((persongender=='F') && (age<=18))
	{
		System.out.println("female is a minor");
	}
	if((persongender=='M') && (age<=18))
	{
		System.out.println("male is a minor");
	}
	if((persongender=='F') && (age>=18))
	{
		System.out.println("female is a major");
	}
	if ((persongender=='M') && (age>=18))
	{
		System.out.println("Male is a major");
	}
	
		
}
}
