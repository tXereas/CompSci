import static org.junit.Assert.*;

import org.junit.Test;

public class RegexTest {

	@Test
	public void isBinary() {
		assertFalse(Regex.isBinary("011010410"));
        assertTrue(Regex.isBinary("0111010010110101"));
	}
	
	@Test
	public void isHex() {
		assertTrue(Regex.isHex("1872865ABC63B"));
        assertFalse(Regex.isHex("1236754671LZ92"));
	}
	
	@Test
	public void logCheck() {
		assertEquals(Regex.log("Log 82334: I am now correct"), "I am now correct");
	}
	
	

}
