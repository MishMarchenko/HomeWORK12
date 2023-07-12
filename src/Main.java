import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Part one!");
        List<Dog> collectionFirst = new ArrayList<>();
        collectionFirst.add(new Dog());
        collectionFirst.add(new Dog());

        Set<Cat> collectionSecond = new HashSet<>();
        collectionSecond.add(new Cat());
        collectionSecond.add(new Cat());

        animalSpeak(collectionFirst);
        animalSpeak(collectionSecond);

        System.out.println("Part two!");
        Computers<String, Integer> hp = new Computers<>();
        Computers<String, Double> macOS = new Computers<>();
        hp.setOs("Windows");
        hp.setVersion(10);
        macOS.setOs("Ventura");
        macOS.setVersion(13.2);
        System.out.println(hp.toString());
        System.out.println(macOS.toString());
    }
    public static void animalSpeak(Collection<? extends Animal> collection){
        System.out.println("Animal say Hello");
    }
}