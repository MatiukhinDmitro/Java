package Lab3.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondMain {
    public static void main(String[] args) {
        Sex s = Sex.FEMALE;


        Stream.of(1, 2, 3)
                .map(it -> it + 1)
                .forEach(it -> System.out.println(it + " "));

    }
}