package cards;
import java.util.*;

  public class Deck {

    public ArrayList<Card> deck;

    public Deck() {
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

    public Card removeCard(){
        if(cardCount() > 0) {
          return deck.remove(0);
        }
        return null;
      }
  }