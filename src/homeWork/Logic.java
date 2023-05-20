package homeWork;

import java.util.Random;

public class Logic {



    public int CalculateMaxRange(int difficulty){
        return (difficulty+1)*10;
    }

    public int secretNumber(int difficulty){
        int maxRange= CalculateMaxRange(difficulty);
        Random rand = new Random();
        int secretNumber= rand.nextInt(maxRange);
        return secretNumber+=1;
    }

    public void isHigher(int userTry){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Die Nummer ist Größer");
        System.out.println("du hast "  + (5-userTry) + " versuche übrig:");
    }

    public void isLower(int userTry){
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.print("Die Nummer ist kleiner ");
        System.out.println("du hast "  + (5-userTry) + " versuche übrig:");

    }

    public void startGame(int secretNumber,UserInteraction player,Logic logic, int maxRange){

        int userTry=0;
        System.out.println("Gib eine zahl zwischen 1 und "+ maxRange + " ein du hast " + (5-userTry) +" versuche übrig:");
        while (userTry < 5){
            userTry += 1;
            int userTip = player.NewUserTip();


            if(userTip==secretNumber){
                System.out.println("Gratulation" + " du has die richtige Nummer erraten");
                userTry=6;
            } else if (userTip < secretNumber) {
                logic.isHigher(userTry);
            } else if (userTip > secretNumber) {
                logic.isLower(userTry);
            }

            if (userTip+1==secretNumber || userTip-1==secretNumber) {
                System.out.println("Es wird heißer");
            }
        }

        if(userTry==5){
            System.out.println("Du hast leider verloren, versuche es noch einmal :)");
        }
    }

}
