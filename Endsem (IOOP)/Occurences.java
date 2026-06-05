import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :");
        String occur = scanner.nextLine();
        System.out.println("Enter the character to check its occurence : ");
        char check = scanner.next().charAt(0);
        char[] ch = occur.toCharArray();
        int count = 0;
        for(int i=0; i<ch.length; i++){
            if(check==ch[i]){
                count++;
            }
        }
        System.out.println("The occurence of the character " + check + " in given string is : " + count);
        scanner.close();
    }
}
