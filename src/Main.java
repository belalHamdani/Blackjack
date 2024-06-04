public class Main {

    public Card[] deck; // declare array of cards
    public Player player1;
    // make array of players called players
    public static void main(String[] args) {
        Main m = new Main();
    }

    public Main() {
        System.out.println("game starting!");
        //construct deck



        deck = new Card[52];
        //fill deck with cards

      int counter = 0;
       for (int s = 1; s <=4; s++) {
           for (int i = 1; i < 14; i++) {
               Card c = new Card(i, s);
               deck[counter] = c;
               counter ++;
              // deck[i - 1].printCard();

           }
       }
       shuffle();
       printDeck();
      // printHand();

       //construct player
        player1 = new Player();
        players = new Player [4];
        for(int p = 0; p < 4; p++){
            players[p] = new Player();
            players[i].printinfo();
        }

        /// players is an array of players ----- players[0] is a single player
       deal();


    }


    public void shuffle() {
        for (int x = 1; x <=51; x++){
            Card temp = deck[x];
            int r = (int)(Math.random()*52);
            deck[x] = deck[r];
            deck[r] = temp;

        }


    }
    public void deal() {

        //deal the first card in the deck to player1
        for(int i = 0; i < player1.hand.length; i++) {
            player1.hand[i] = deck[i];
        }
        player1.printHand();
        for (int x = 0; x < 51; x++) {
            Card temp = deck[x];
            int r = (int) (Math.random() * 52);
            deck[x] = deck[r];
            deck[r] = temp;
        }
    }
    public void printDeck() {
        //for loop to loop all elements of deck (52)
        //for each call printCard()

        for(int y = 0; y < 52; y++) {
            deck [y].printCard();
        }

    }
}
