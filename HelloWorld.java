import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args){
        Scanner kb  = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = kb.nextLine();
        System.out.println("Hello, " + name);
        Computer computer1 = new Computer();
        System.out.println(computer1.getColor());
        kb.close();
    }

}