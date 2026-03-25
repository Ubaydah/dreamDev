package weekTwo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class findLCMTest {

    @Test
    @DisplayName("Should find the lcm of numbers")
    public void returnLcmOf_ListOfNumbers(){
        int[] numbers = {50, 20, 30};
        int result = findLCM.checkLCMOfList(numbers);

        assertEquals(300, result);
    }

}
