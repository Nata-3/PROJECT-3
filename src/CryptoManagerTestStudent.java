import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CryptoManagerTestStudent {

	   @BeforeEach
	    public void setUp() throws Exception {
	        // Setup before each test
	    }

	    @AfterEach
	    public void tearDown() throws Exception {
	        // Cleanup after each test
	    }

	    @Test
	    public void testStringInBounds() {
	        assertTrue(CryptoManager.isStringInBounds("HELLO"));
	        assertFalse(CryptoManager.isStringInBounds("hello")); // Lowercase should fail
	    }

	    @Test
	    public void testCaesarEncryption() {
	        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
	        assertEquals("BCD", CryptoManager.caesarEncryption("ABC", 1));
	        assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
	    }

	    @Test
	    public void testCaesarDecryption() {
	        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3));
	        assertEquals("ABC", CryptoManager.caesarDecryption("BCD", 1));
	        assertEquals("HELLO", CryptoManager.caesarDecryption("1.558", 105));
	    }

	    @Test
	    public void testBellasoEncryption() {
	        assertEquals("SJ%WT", CryptoManager.bellasoEncryption("HELLO", "KEY"));
	        assertEquals("Y[]Y[]", CryptoManager.bellasoEncryption("ABCABC", "XYZ"));
	    }

	    @Test
	    public void testBellasoDecryption() {
	        assertEquals("HELLO", CryptoManager.bellasoDecryption("SJ%WT", "KEY"));
	        assertEquals("ABCABC", CryptoManager.bellasoDecryption("Y[]Y[]", "XYZ"));
	    }
}
