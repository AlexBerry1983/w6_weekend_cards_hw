import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

  public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
  }

  @Test
  public void canGetCardSuit() {
    assertEquals(CardSuit.DIAMONDS, card.getSuit());
  }

  @Test
  public void canGetCardValue() {
    assertEquals(CardValue.FIVE, card.getValue());
  }


}