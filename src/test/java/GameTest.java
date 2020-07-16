import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void before(){
        game = new Game();
        player1 = new Player("Matthew");
        player2 = new Player("Craig");
        game.addPlayer(player1);
        game.addPlayer(player2);
    }

    @Test
    public void canGetDeck(){
        assertEquals(52, game.getDeck().getCardsSize());
    }

    @Test
    public void canDealToAll(){
        game.dealCards();
        assertEquals(1, player1.getHandSize());
        assertEquals(1, player2.getHandSize());
    }

    @Test
    public void canGetWinner(){
        game.dealCards();
        assertEquals(player2, game.checkWinner());
    }
}
