package snrlint1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class sonartest {

		@Test
		public void method1() {
			assertEquals("A", "A");
			assertEquals(20, 20, "Method 1 here");
			assertEquals(2 + 2, 4);
		}

}
