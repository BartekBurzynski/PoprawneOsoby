import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Person person = new Person(input.nextLine(),input.nextLine(),input.nextInt(),input.nextInt());

        System.out.println(person);
    }
}