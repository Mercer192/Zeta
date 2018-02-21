//Project Zeta
//Created by: Dominic DeMaria (Jak)
//Last edited: 2/19/2018
//To do:
//-Convert to new language (Java a Temp language to get basics/learning)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to project Zeta");// Welcome title

        //Menu More option to be added basic core options at the moment
        //To Do: Make Menu a function/class
        final int NEWGAME = 1;
        final int LOADGAME = 2;
        final int EXIT = 0;
        System.out.println("Main Menu:\n");
        System.out.println("1. New Game\n" +
                "2.Load Game\n" +
                "0. Exit\n");
        System.out.println("Selection ->");
        Scanner menuInput = new Scanner(System.in);
        int input = menuInput.nextInt();

        switch(input)
        {
            case NEWGAME:
                System.out.println("New game being created...\n");
                System.out.println("Enter your character name: ");
                String name = menuInput.next();
                System.out.println();

                //New Game call
                break;
            case LOADGAME:
                //Load game call
                break;
            case EXIT:
                System.out.println("\nGood bye!");
                System.exit(EXIT);
                break;
        }//End of switch
    }//End of PSVM
}//End of Class Main
