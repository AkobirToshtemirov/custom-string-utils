import org.junit.jupiter.api.Test;
import org.epam.utils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("42"));
        assertFalse(StringUtils.isPositiveNumber("-42"));
        assertFalse(StringUtils.isPositiveNumber("notanumber"));
    }
}