import Cards.PlayingCard;
import Cards.Rank;
import Cards.Suit;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<PlayingCard> cards;

    public Deck(){
        cards = new ArrayList<PlayingCard>();
        generateDeck();
        shuffle();
    }

    public int getNumberOfCards(){
        return cards.size();
    }

    private void generateDeck(){
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                cards.add(new PlayingCard(rank, suit));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

}