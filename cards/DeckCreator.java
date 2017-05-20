package cards;
import java.util.*;

  public class DeckCreator {

    public ArrayList<Card> deck;

    public DeckCreator() {
      this.deck = new ArrayList<Card>();
    }

    public int cardCount() {
      return deck.size();
    }

  }