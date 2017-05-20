package cards;
import java.util.*;

  public class DeckCreator {

    public ArrayList<Card> deck;

    public DeckCreator() {
      this.deck = new ArrayList<Card>();
      
      CardValue[] allTheValues = CardValue.values();
      CardSuit[] allTheSuits = CardSuit.values();

      for (CardSuit suit : allTheSuits) {
        for (CardValue value : allTheValues) {
          deck.add(new Card(suit, value));
        }
      }
    Collections.shuffle(deck);

    }

    public int cardCount() {
      return deck.size();
    }

    
  }