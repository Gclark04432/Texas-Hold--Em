import Cards.PlayingCard;
import Cards.Rank;
import Cards.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {
    private Hand hand;
    private PlayingCard card;

    @Before
    public void before(){
        hand = new Hand();
        card = new PlayingCard(Rank.ACE, Suit.DIAMONDS);
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, hand.getHandSize());
    }

    @Test
    public void canAddCardToHand(){
        hand.addToHand(card);
        assertEquals(1, hand.getHandSize());
    }
}
