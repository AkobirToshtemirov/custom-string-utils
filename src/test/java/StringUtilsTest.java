import org.junit.jupiter.api.Test;
import org.epam.utils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
    /* remove the test from the method name */
    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("42"));
        assertTrue(StringUtils.isPositiveNumber("43.5"));
        assertFalse(StringUtils.isPositiveNumber("-43.5"));
        assertFalse(StringUtils.isPositiveNumber("-42"));
        assertFalse(StringUtils.isPositiveNumber("notanumber"));
    }
}