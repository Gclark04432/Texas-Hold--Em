import Cards.PlayingCard;
import Cards.Rank;
import Cards.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {
    private Hand hand;
    private PlayingCard aceOfDiamonds;
    private PlayingCard aceOfHearts;
    private PlayingCard aceOfSpades;
    private PlayingCard aceOfClubs;

    @Before
    public void before(){
        hand = new Hand();
        aceOfDiamonds = new PlayingCard(Rank.ACE, Suit.DIAMONDS);
        aceOfHearts = new PlayingCard(Rank.ACE, Suit.HEARTS);
        aceOfClubs = new PlayingCard(Rank.ACE, Suit.CLUBS);
        aceOfSpades = new PlayingCard(Rank.ACE, Suit.SPADES);
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, hand.getHandSize());
    }

    @Test
    public void canAddCardToHand(){
        hand.addToHand(aceOfDiamonds);
        assertEquals(1, hand.getHandSize());
    }

    @Test
    public void canReadIndividualCardInHand(){
        hand.addToHand(aceOfDiamonds);
        hand.addToHand(aceOfHearts);
        hand.addToHand(aceOfClubs);
        hand.addToHand(aceOfSpades);
        assertEquals(aceOfDiamonds, hand.getCardByIndex(0));
    }
}
