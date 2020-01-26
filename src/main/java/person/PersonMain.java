package person;
import java.util.*;
import org.apache.log4j.Logger;

public class PersonMain {

    final static Logger LOGGER = Logger.getLogger(PersonMain.class);

    public static void main(String[] args) {


        Polish polish = new Polish("Anna", "Jot", 28, "W", true,
                0, "25555");

        System.out.print("EMERYTURA: ");
        System.out.println(polish.isRetired());
        System.out.print("OPIS: ");
        System.out.println(polish.toString());
        System.out.print("KARTA DUZEJ RODZINY: ");
        System.out.println(polish.enabledKdr());
        System.out.print("PRAWO JAZDY: ");
        System.out.println(polish.canDriveCar());
        System.out.print("MOZE JEZDZIC: ");
        System.out.println(polish.canRace());

        Race race1 = new Race("Gokards", 10);
        Race race2 = new Race("F1 Monte Carlo", 18);
        Race race3 = new Race("F1 Le Mans", 12);
        Race race4 = new Race("F1 cos tam", 18);
        race1.setRaceYear(2019);
        race2.setRaceYear(2019);
        race3.setRaceYear(2019);
        race4.setRaceYear(2020);

        List<Race> races = new LinkedList<>();
        races.add(race1);
        races.add(race2);
        races.add(race3);
        races.add(race4);

        System.out.println("-------------");
        System.out.println("Wydruk wyścigów bez sortowania: ");
        for (Race race : races) {
            System.out.println(race.getRaceName() + " " + race.getRaceYear());
        }

        System.out.println("-------------");
        System.out.println("Wydruk wyścigów z sortowaniem: ");
        Collections.sort(races);
        for (Race race : races) {
            System.out.println(race.getRaceName() + " " + race.getRaceYear());
        }

        System.out.println("-------------");
        System.out.println("Wydruk wyścigów z sortowaniem po wieku i nazwie: ");
        Collections.sort(races, new RaceSortByMinAgeAndName());
        for (Race race : races) {
            System.out.println(race.getRaceName() + " " + race.getRaceYear());
        }

        System.out.println("---------------------");
        Set<Race> racersSet = new HashSet<>();
        racersSet.add(race1);
        racersSet.add(race2);
        racersSet.add(race3);
        racersSet.add(race4);

        for (Race race : racersSet) {
            System.out.println(race.getRaceName() + " " + race.getRaceYear());
        }
        System.out.println("---------------------");

        Map<String, Race> raceMap = new HashMap();
        raceMap.put(race1.getRaceName(), race1);
        raceMap.put(race2.getRaceName(), race2);
        raceMap.put(race3.getRaceName(), race3);
        raceMap.put(race4.getRaceName(), race4);
        raceMap.put(race4.getRaceName(), race1);

        System.out.println("Mapa po wartościach");

        for (Race race : raceMap.values()) {
            System.out.println(race.getRaceName() + " " + race.getRaceYear());
        }

        System.out.println("-----------");

        System.out.println("Mapa po kluczach");
        for (String key : raceMap.keySet()) {
            System.out.println(raceMap.get(key).getRaceName() + " "
                    + raceMap.get(key).getRaceYear());
        }


        Map<raceKey, Race> racersMap2 = new HashMap<>();
        racersMap2.put(new raceKey(race1.getRaceName(), race1.getRaceYear()), race1);
        racersMap2.put(new raceKey(race2.getRaceName(), race2.getRaceYear()), race2);
        racersMap2.put(new raceKey(race3.getRaceName(), race3.getRaceYear()), race3);
        System.out.println("Mapa po kluczu2: ");
        for (raceKey raceKey : racersMap2.keySet()) {
            System.out.println(racersMap2.get(raceKey).getRaceName() + " " + racersMap2.get(raceKey).getRaceYear());
        }

        LOGGER.error("This is error message");
        LOGGER.warn("This is warning");
        LOGGER.fatal("This is fatal error");
        LOGGER.debug("This is debug message");
        LOGGER.info("This is info message");

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("INFO");
        }

        PersonMain mainTest = new PersonMain();
        try {
            mainTest.divide(10, 0);
        } catch (ArithmeticException ex) {
            LOGGER.error("Something's wrong", ex);
        }

    }

    private void divide(int a, int b) {
        int i = a/b;
    }

}
