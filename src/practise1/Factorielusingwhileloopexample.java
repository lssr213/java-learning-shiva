package practise1;

public class Factorielusingwhileloopexample {

	public static void main(String[] args) {
		int givennumber=4;
		int factorielvalue=1;
		while(givennumber>1) {
			factorielvalue=factorielvalue*givennumber;
			givennumber--;
		}
		System.out.println(factorielvalue);
	}

}
