import Cards.PlayingCard;
import java.util.ArrayList;

public class Hand {
    private ArrayList<PlayingCard> cards;

    public Hand(){
        cards = new ArrayList<PlayingCard>();
    }

    public int getHandSize(){
        return this.cards.size();
    }

    public void addToHand(PlayingCard card){
        this.cards.add(card);
    }
}
