import java.math.BigInteger;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese 'SECURE INIT' si desea comenzar con el programa ");
		
		String iniciar = sc.next();
		
		Boolean centinela = true; 
		
	    BigInteger Pmain = null;
		
		BigInteger Gmain = null;
		
		BigInteger Gxmain = null;
		
		if( iniciar.equals("SECURE INIT")) {
		System.out.println("Para detener la ejecucion precione la tecla '.' ");
		
		while (centinela) {
		
			System.out.println("Ingrese un valor primo P: ");
			Pmain = sc.nextBigInteger();
			
			System.out.println("Ingrese un valor para G (<P) : ");
			Gmain = sc.nextBigInteger();
			
			
			System.out.println("Ingrese un valor para Gx (<p-1): ");
			Gxmain = sc.nextBigInteger();
			centinela = false;
			
			}
		
		Cifrado cypher = new Cifrado(Gmain,Pmain,Gxmain);
			
			
		}
	}
}

	
	

