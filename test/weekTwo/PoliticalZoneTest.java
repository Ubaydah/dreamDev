package weekTwo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PoliticalZoneTest {

    @Test
    @DisplayName("Should return North East for a state in North East")
    public void returnNorthEast_forStateInNorthEast() {
        String result = PoliticalZone.getStateFromZone("Bauchi");
        assertEquals("NORTH_EAST", result);
    }

    @Test
    @DisplayName("Should return South West for a state in South West")
    public  void returnSouthWest_forStateInSouthWest(){
        String result = PoliticalZone.getStateFromZone("Lagos");
        assertEquals("SOUTH_WEST", result);
    }

    @Test
    @DisplayName("Should not return a state not in a particular zone")
    public void notReturnState_notInaZone(){
        String result = PoliticalZone.getStateFromZone("Kano");
        assertNotEquals("SOUTH_WEST", result);
    }

}
