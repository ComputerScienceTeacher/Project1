import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args){
        Scanner kb  = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = kb.nextLine();
        System.out.println("Hello, " + name);
        kb.close();
    }

}