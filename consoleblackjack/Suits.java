package consoleblackjack;

public enum Suits {
    S_SPADES {
        @Override
        public String toString() {
            return "\u2660";
        }
    },
    S_HEARTS {
        @Override
        public String toString() {
            return "\u2665";
        }
    },
    S_CLUBS {
        @Override
        public String toString() {
            return "\u2663";
        }
    },
    S_DIAMONDS {
        @Override
        public String toString() {
            return "\u2666";
        }
    }
}
