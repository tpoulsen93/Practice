import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuite {

	@Test
	void duplicateChecker_122_2() {
		int[] array = {1,2,2};
		DuplicateChecker check = new DuplicateChecker(array);
		String result = check.toString();
		
		assertEquals(result, "[2]");
	}

}
