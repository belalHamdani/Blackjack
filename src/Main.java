public class Main {

    public Card[] deck; // declare array of cards

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
       deal();


    }

    public void shuffle() {
        for (int x = 1; x <=52; x++){
            Card temp = deck[x];
            int r = (int)(Math.random()*52);
            deck[x] = deck[r];
            deck[r] = temp;

        }


    }
    public void deal() {

    }
    public void printDeck() {
        //for loop to loop all elements of deck (52)
        //for each call printCard()

        for(int y = 0; y < 52; y++) {
            deck [y].printCard();
        }

    }
}
