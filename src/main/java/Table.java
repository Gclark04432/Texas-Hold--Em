import Cards.PlayingCard;

import java.util.ArrayList;

public class Table implements IGetsCards {
    private ArrayList<PlayingCard> cards;

    public Table(){
        cards = new ArrayList<PlayingCard>();
    }

    public Hand getHand() {
        return null;
    }
}
