import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getMaxCardValue(){
        int max = 0;
        for(int i = 0; i < hand.size(); i++){
            max = hand.get(i).getRank().getValue();
        }
        return max;
    }
}
