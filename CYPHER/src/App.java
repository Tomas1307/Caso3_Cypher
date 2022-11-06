import java.math.BigInteger;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type 'SECURE INIT' if you wish to begin ");
		
		String begin = sc.next();
		
		Boolean sentinel = true; 
		
	    BigInteger Pmain = null;
		
		BigInteger Gmain = null;
		
		BigInteger Gxmain = null;
		
		if( begin.equals("SECURE INIT")) {
		System.out.println("Para detener la ejecucion precione la tecla '.' ");
		
		while (sentinel) {
		
			System.out.println("value for P: ");
			Pmain = sc.nextBigInteger();
			
			System.out.println("value for G (<P) : ");
			Gmain = sc.nextBigInteger();
			
			
			System.out.println("value for Gx (<p-1): ");
			Gxmain = sc.nextBigInteger();
			sentinel = false;
			
			}
		
		CypherAlgorithm cypher = new CypherAlgorithm(Gmain,Pmain,Gxmain);
			
			
		}
	}
}

	
	

