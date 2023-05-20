package homeWork;

import java.util.Scanner;

public class UserInteraction {
    Scanner scan = new Scanner(System.in);

    public String askForPlayerName(){
        System.out.print("Hallo wie ist dein name: ");
        String playerName= scan.next();
        System.out.println("Hallo " + playerName);
        return playerName;
    }

    public int choiceDifficulty(){
        int difficulty = -1;
        while (difficulty < 1 || difficulty >4) {
            System.out.print("Wähle eine Schwierigkeitsstufe  (1=leicht , 2=Normal , 3=Hart ,4=Sehr schwer): ");
            difficulty = scan.nextInt();

        }
        return difficulty;

    }

    public int NewUserTip(){
        return scan.nextInt();
    }







}
