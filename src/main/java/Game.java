import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        deck.makeDeck();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void shuffleDeck(){
        deck.shuffleDeck();
    }

    public void dealCards(){
        for(int i = 0; i < players.size(); i++){
            deck.deal(players.get(i));
        }
    }

    public Player checkWinner(){
        Player winner = null;
        int currentMax = 0;
        for (int i = 0; i < players.size(); i++){
            if (players.get(i).getMaxCardValue() > currentMax){
                winner = players.get(i);
                currentMax = winner.getMaxCardValue();
            }
        }
        return winner;
    }

    public Deck getDeck() {
        return deck;
    }
}
