import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

  public class CardTest {

  Card card;
  Deck deck;

  @Before
  public void before() {
    card = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
    deck = new Deck();
  }

  @Test
  public void canGetCardSuit() {
    assertEquals(CardSuit.DIAMONDS, card.getSuit());
  }

  @Test
  public void canGetCardValue() {
    assertEquals(CardValue.FIVE, card.getValue());
  }

  @Test
  public void deckStartsFull() {
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void canRemoveCard() {
    deck.removeCard();
    assertEquals(51, deck.cardCount());
  }
}