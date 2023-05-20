package homeWork;

public class Main {
    public static void main(String[] args) {

        UserInteraction player = new UserInteraction();
        Logic logic = new Logic();

        player.askForPlayerName();
        int difficulty = player.choiceDifficulty();
        int secretNumber = logic.secretNumber(difficulty);
        int maxRange = logic.CalculateMaxRange(difficulty);

        logic.startGame(secretNumber,player,logic,maxRange);


    }
}
