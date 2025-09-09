package iut.qualite.tp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubTest {
	@Test
	void testSub(){
		Sub sub = new Sub();
		int resultat = sub.sub(128-7);
		assertEquals(121, resultat, "128 - 7 devrait être 121";
	}
}