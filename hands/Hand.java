package hands;
import java.util.*;
import cards.*;
import players.*;

public class Hand {

  Deck deck;
  ArrayList<Card> myHand = new ArrayList<Card>(); 

  public Hand() {
    this.myHand = new ArrayList<Card>();
  }
  
  public void addCardToHand(Deck deck) {
    for (int i = 0; i <= 0; i ++) {
      myHand.add(deck.removeCard());
    }
  }

  public int countCardsInHand() {
    return myHand.size();
  }

 
}