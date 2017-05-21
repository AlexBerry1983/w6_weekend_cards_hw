import static org.junit.Assert.*;
import org.junit.*;
import players.*;
import cards.*;
import hands.*;
import java.util.*; 

public class HandTest {

  Player player;
  Deck deck;
  Hand hand;
  
  @Before
  public void before() {
    player = new Player("Alex");
    deck = new Deck();
    hand = new Hand();
  }

  @Test
  public void checkHandStartsEmpty() {
    assertEquals(0, hand.countCardsInHand());
  }
  
  // @Test
  // public void canAddCardToHand(Deck card) {
  //   hand.addCardToHand(card);
  //   assertEquals(1, hand.countCardsInHand());
  // }
}