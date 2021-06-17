package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void run() {
        TreeMap<Person, Integer> map = new TreeMap<>(Comparator.comparingInt(o -> o.age));
        map.put(new Person("John", "Smith", 17), 0);
        map.put(new Person("Ivan", "Petrenko", 65), 0);
        map.put(new Person("Pedro", "Escobar", 32), 0);
        map.put(new Person("Radion", "Pyatkin", 14), 0);
        map.put(new Person("Sergey", "Vashkevich", 19), 0);

        Person firstAdultPerson = map.navigableKeySet()
                .stream()
                .filter(person -> person.age > 18)
                .findFirst()
                .get();

        Map<Person, Integer> youngPeopleMap = map.headMap(firstAdultPerson, false);
        Map<Person, Integer> adultPeopleMap = map.tailMap(firstAdultPerson, true);
        showAdvertisementToYoung(youngPeopleMap);
        showAdvertisementToAdult(adultPeopleMap);
    }

    public static void showAdvertisementToYoung(Map map){
        LOGGER.info("Young :");
        map.keySet().forEach(p -> LOGGER.info(p.toString()));
    }

    public static void showAdvertisementToAdult(Map map){
        LOGGER.info("Adult :");
        map.keySet().forEach(p -> LOGGER.info(p.toString()));
    }

}