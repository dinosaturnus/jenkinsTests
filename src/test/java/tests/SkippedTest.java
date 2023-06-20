package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")

public class SkippedTest {

    @Test
    @Disabled("some reason")
    void someTest9() {
        assertTrue(true);
    }
}
