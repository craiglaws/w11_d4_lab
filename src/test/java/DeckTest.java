import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Player player1;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player();
    }

    @Test
    public void deckCanPopulate(){
        deck.makeDeck();
        assertEquals(52, deck.getCardsSize());
    }

    @Test
    public void canGetFirsCard(){
        deck.makeDeck();
        assertEquals(RankType.ACE, deck.getFirstCard().getRank());
    }

    @Test
    public void deckCanShuffle(){
        deck.makeDeck();
        deck.shuffleDeck();
        assertNotEquals(RankType.ACE, deck.getFirstCard().getRank());
    }

    @Test
    public void dealRemovesCard(){
        deck.makeDeck();
        deck.getFirstCard();
        assertNotEquals(RankType.ACE, deck.getFirstCard().getRank());
    }

    @Test
    public void canDealCard(){
        deck.makeDeck();
        deck.deal(player1);
        assertEquals(1, player1.getHandSize());
    }
}
