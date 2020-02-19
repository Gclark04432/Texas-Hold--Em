import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableTest {
    private Table table;
    private Hand hand;

    @Before
    public void before(){
        table = new Table();
        hand = new Hand();
    }

    @Test
    public void tableStartsWithNoCards(){
        assertEquals(0, hand.getHandSize());
    }
}
