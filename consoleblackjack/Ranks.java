package consoleblackjack;

public enum Ranks {
    R_2(2) {
        @Override
        public String toString() {
            return "2";
        }
    },
    R_3(3) {
        @Override
        public String toString() {
            return "3";
        }
    },
    R_4(4) {
        @Override
        public String toString() {
            return "4";
        }
    },
    R_5(5) {
        @Override
        public String toString() {
            return "5";
        }
    },
    R_6(6) {
        @Override
        public String toString() {
            return "6";
        }
    },
    R_7(7) {
        @Override
        public String toString() {
            return "7";
        }
    },
    R_8(8) {
        @Override
        public String toString() {
            return "8";
        }
    },
    R_9(9) {
        @Override
        public String toString() {
            return "9";
        }
    },
    R_T(10) {
        @Override
        public String toString() {
            return "T";
        }
    },
    R_J(10) {
        @Override
        public String toString() {
            return "J";
        }
    },
    R_Q(10) {
        @Override
        public String toString() {
            return "Q";
        }
    },
    R_K(10) {
        @Override
        public String toString() {
            return "K";
        }
    },
    R_A(11) {
        @Override
        public String toString() {
            return "A";
        }
    };
    
    private int rankValue;
    
    Ranks(int rankValue) {
        this.rankValue = rankValue;
    }
}
