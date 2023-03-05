import java.util.Scanner;

public class characterCount {
    public static void main(String [] args) {

        String userName;
        byte age;
        String question;

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?:\t");
        userName = input.next().substring(0);


        while(userName.length() <= 2) {
            System.out.print("Please enter a valid name:\t");
            userName = input.next();
        }

        System.out.print("How old are you?:\t");
        age = input.nextByte();

        System.out.println("Hi, " + userName + "!" + " You are " + age + " years old!");

        System.out.print("Are you curious to know how many characters in your name?\t");
        question = input.next();

        if(question.equals("yes")) {
            System.out.println("Your name has " + userName.length());
        } else {
            System.out.println("Well, you're going to find out anyways! " + userName.length());
        }

        input.close();




    }
}
