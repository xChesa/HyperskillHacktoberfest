package consoleblackjack;

public class Card {
    private final Ranks rank;
    private final Suits suit;
    
    public Card(int rank, int suit) {
        this.rank = Ranks.values()[rank];
        this.suit = Suits.values()[suit];
    }
    
    @Override
    public String toString() {
        return suit.toString() + rank.toString();
    }
}
