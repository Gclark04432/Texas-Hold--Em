import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void canRemoveCardFromDeck(){
        deck.dealCard();
        assertEquals(51, deck.getNumberOfCards());
    }
}
