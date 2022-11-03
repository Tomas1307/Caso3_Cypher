import java.math.BigInteger;
import java.security.PublicKey;

public class Cifrado {
	
	private BigInteger y ;
	private BigInteger z;

	private BigInteger G;

	private BigInteger Gx;
	
	private BigInteger P;

	public Cifrado(BigInteger gmain, BigInteger pmain, BigInteger gxmain) {
		this.G = gmain;
		this.P = pmain;
		this.Gx = gxmain;
	}

		


}
