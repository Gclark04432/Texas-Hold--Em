public enum Score {
    HIGHCARD(1),
    PAIR(2),
    TWOPAIR(3),
    THREEOFAKIND(4),
    STRAIGHT(5),
    FLUSH(6),
    FULLHOUSE(7),
    FOUROFAKIND(8),
    STRAIGHTFLUSH(9),
    ROYALFLUSH(10);

    private int value;

    Score(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
