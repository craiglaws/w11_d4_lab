import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        String input = "";

        while(!input.equals("no")){
            runGame();
            System.out.println("Type 'No' to quit game. Press any other key to play again.");
            input = "";
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine().toLowerCase();

        }



    }

    public static void runGame() {
        Game game = new Game();
        Player player1 = new Player("Craig");
        Player player2 = new Player("Matthew");
        game.addPlayer(player1);
        game.addPlayer(player2);

        game.shuffleDeck();
        game.dealCards();
        Player winner = game.checkWinner();
        ArrayList<Card> winnerHand = winner.getHand();
        System.out.println("The winner is " + winner.getName() + " with a " + winnerHand.get(0).getRank() + " of " + winnerHand.get(0).getSuit());


    }
}
