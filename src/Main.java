import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Person person = null;
        try {
            person = new Person(input.nextLine(),input.nextLine(),input.nextInt(),input.nextInt());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(person);
    }
}