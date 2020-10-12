package consoleblackjack;

public class TextUI {
    
    public TextUI() {
    
    }
    
    public void start() {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck(true);
    
        System.out.println(deck1);
        System.out.println("-----------------------------------------");
        System.out.println(deck2);
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 10; ++i) {
            System.out.println("You draw a card from deck 1....\n" +
                    "The card is a " + deck1.draw() + "!\n");
            System.out.println("You draw a card from deck 2....\n" +
                    "The card is a " + deck2.draw() + "!\n" +
                    "-------------");
        }
    }
}
