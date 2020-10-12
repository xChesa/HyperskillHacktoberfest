package consoleblackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final int SIZE = 52;
    private final List<Card> cards = new ArrayList<>(52);
    
    private int ranksCount = Ranks.values().length;
    private int suitsCount = Suits.values().length;
    
    private int cardPointer = 0;
    
    public Deck() {
        for (int i = 0; i < suitsCount; ++i) {
            for (int j = 0; j < ranksCount; ++j) {
                cards.add(new Card(j, i));
            }
        }
    }
    
    public Deck(boolean shuffled) {
        this();
        shuffle();
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
        cardPointer = 0;
    }
    
    public void shuffle(int xTimes) {
        for (int i = 0; i < xTimes; ++i) {
            shuffle();
        }
    }
    
    public Card draw() {
        if (cardPointer == SIZE) {
            return null;
        }
        return cards.get(cardPointer++);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < suitsCount; ++i) {
            for (int j = 0; j < ranksCount; ++j) {
                sb.append(cards.get(i * ranksCount + j)).append(" ");
            }
            if (i < suitsCount - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
