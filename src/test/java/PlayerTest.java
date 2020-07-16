import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Craig");
        player2 = new Player("Matthew");
        deck = new Deck();
        deck.makeDeck();

    }

    @Test
    public void canAddCardToHand(){
        Card card = deck.getFirstCard();
        player1.addCard(card);
        assertEquals(1, player1.getHandSize());
    }
}
