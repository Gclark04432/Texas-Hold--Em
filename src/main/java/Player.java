public class Player implements IGetsCards{
    private Hand hand;
    private String name;

    public Player(Hand hand){
        this.hand = hand;
    }

    public Hand getHand(){
        return this.hand;
    }
}
