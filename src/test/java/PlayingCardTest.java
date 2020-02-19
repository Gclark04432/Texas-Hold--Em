import Cards.PlayingCard;
import Cards.Rank;
import Cards.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayingCardTest {
    private PlayingCard card;

    @Before
    public void before(){
            card = new PlayingCard(Rank.ACE, Suit.DIAMONDS);
    }

    @Test
    public void cardHasRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void cardHasSuit(){
        assertEquals(Suit.DIAMONDS, card.getSuit());
    }
}
