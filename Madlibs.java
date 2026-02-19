import java.util.Scanner;

public class Madlibs{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getinput(scanner, "Enter a name : ");
        String place = getinput(scanner, "Enter a place : ");
        String adjective = getinput(scanner, "Enter an adjective : ");
        String noun = getinput(scanner, "Enter a noun : ");
        String verb = getinput(scanner, "Enter a verb in past tense : ");

        printStory(name, place, adjective, noun, verb);

        scanner.close();
    }

    public static String getinput(Scanner scanner, String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static void printStory(String name, String place, String adjective, String noun, String verb){
        System.out.println("\n----------------YOUR MADLIBS STORY----------------\n");
         System.out.println("One day, " + name + " went to " + place + ".");
        System.out.println("It was a very " + adjective + " day.");
        System.out.println("Suddenly, a " + noun + " appeared!");
        System.out.println(name + " " + verb + " immediately.");
        System.out.println("And that was the most unforgettable day ever.");
    }
}