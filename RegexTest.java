import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	
	@SuppressWarnings("deprecation")
	@Test
	public void combine() {
		String [] strings = {"I", "DO", "NOT", "WANT", "TO", "DO", "THIS"};
	    assertEquals(Regex.combine("I:DO:NOT:WANT:TO:DO:THIS"), strings );
	}
	
	@Test
	public void convention() {
		List <String> strings = new ArrayList<String>();
		strings.add("_fjsdfHF");
		strings.add("234kjsdfH");
		strings.add("Fhshf");
		Regex.convention(strings);
		assertEquals( strings.size(), 1);
	}
	
	

}
