package weekTwo;
import java.util.Arrays;
import java.util.Scanner;
public enum PoliticalZone {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarrawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi"),
    SOUTH_SOUTH("Akwa-ibom", "Cross-River", "Bayelsa", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Oyo", "Lagos", "Ogun", "Ondo", "Osun", "Ekiti");

    private final String[] state;

    PoliticalZone(String... states){
        this.state = states;
    }

    public static String[] getStates(PoliticalZone zone) {
        return zone.state;
    }

    public static String getStateFromZone(String state){
//        Scanner inputCollector = new Scanner(System.in);
//        System.out.println("Enter a state");
//
//        state = inputCollector.nextLine();
        String result = "";

        for (PoliticalZone zone: PoliticalZone.values()){
            String[] states = getStates(zone);
            if (Arrays.asList(states).contains(state)){
                result = zone.name();
            }
        }

        return result;
    }

}
