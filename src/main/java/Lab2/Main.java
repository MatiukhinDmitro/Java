package Lab2;

        import Lab2.controller.UniversityCreator;
        import Lab2.model.University;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator(new Scanner(System.in));
        University university = universityCreator.createUniversity();
        System.out.println(university.toString());
    }
}
