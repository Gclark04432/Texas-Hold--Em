package Cards;

public enum Suit {
    CLUBS("Clubs"),
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds");


    private String suit;

    Suit(String suit){
        this.suit = suit;
    }

    public String getSuit(){
        return this.suit;
    }
}
