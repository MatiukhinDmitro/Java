package Lab4;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import Lab4.controller.AddressCreator;
import Lab4.controller.CitizenCreator;
import Lab4.model.Address;
import Lab4.model.Citizen;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    //    private static final String PATH_ADDRESS = "src/main/resources/address.json";
//    private static final String PATH_CITIZEN = "src/main/resources/citizen.json";
    private static final String PATH_STREETS = "src/main/resources/streets.json";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        AddressCreator addressCreator = new AddressCreator(scanner);
//        Address address = addressCreator.createAddress();
        CitizenCreator citizenCreator = new CitizenCreator(scanner);
//        Citizen citizen = citizenCreator.createCitizen();
//        System.out.println(address.toString());
//        System.out.println(citizen.toString());

        System.out.println("Enter count citizens what are you need add: ");
        int count =  scanner.nextInt();
        System.out.println("Enter the letter with which street names should begin: ");
        char choiceLetter = scanner.next().charAt(0);
        ArrayList<Citizen> citizens = new ArrayList<>();
        IntStream.of(1, count).forEach(iterator -> citizens.add(citizenCreator.createCitizen()));
        Set<String> streets = citizens.stream()
                .filter(citizenOnStream -> citizenOnStream.getAddress().getCity().toCharArray()[0] == choiceLetter)
                .map(citizenOnMap -> citizenOnMap.getAddress().getStreet()).collect(Collectors.toSet());

        Gson gson = new Gson();
        String json = gson.toJson(streets);
        File file = new File(PATH_STREETS);
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();
//        JsonReader jsonReader = new JsonReader(new FileReader(file));
//        Citizen formJson = gson.fromJson(jsonReader, Citizen.class);
//
//        if (citizens.equals(formJson)) {
//            System.out.println("EQUALS!!");
//        }

    }
}