import java.math.BigInteger;
import java.security.PublicKey;

public class CypherAlgorithm {
	
	private BigInteger y ;
	private BigInteger z;

	private BigInteger G;

	private BigInteger Gx;
	
	private BigInteger P;

	public CypherAlgorithm(BigInteger gmain, BigInteger pmain, BigInteger gxmain) {
		this.G = gmain;
		this.P = pmain;
		this.Gx = gxmain;
	}

		


}
