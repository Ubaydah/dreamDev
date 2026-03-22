package dsa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    @DisplayName("Stack should be empty")
    public void newStack_isEmptyTest() {
        Stack strings = new Stack();

        assertTrue(strings.isEmpty());

    }

    @Test
    @DisplayName("Stack should not be empty if element is added")
    public void addElement_StackIsNotEmpty() {
        Stack strings = new Stack();

        strings.push("G-Strings");
        strings.push("A-Strings");
        assertFalse(strings.isEmpty());

        String popped = strings.pop();
        assertTrue(strings.isEmpty());
    }
}
