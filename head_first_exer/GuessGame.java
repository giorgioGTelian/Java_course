public class GuessGame {
    //guessgame has three instances variables for three player objs
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        // create three Player objs and assign them to three Player Instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();


        // declare three variables ti ho three guesses the player can make
        int guesssp1 = 0;
        int guesssp2 = 0;
        int guesssp3 = 0;


        // declare three variables to hold true or false based on player answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;


        //make a target number the number that the player must guess 
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Im thinking of a number between 0 and 9... ")

        while (true) {
            System.out.println("Humber to guess is" + targetNumber);
            
            //call each player guess method
            p1.guess();
            p2.guess();
            p3.guess();
            
            //get each player guess (the result of their guess() method running) 
            // by accessing the number variable of each player
            guesssp1 = p1.number;
            System.out.println();
            
            guesssp2 = p2.number;
            System.out.println();
            
            guesssp3 = p3.number;
            System.out.println();
            
            
            // check if each player guess to see if it maches the target numbe, if a player is right 
            // than set te player variable to true
            if (guesssp1 == targetNumber) {
                p1isRight = true;
            }
            if (guesssp2 == targetNumber) {
                p2isRight = true;
            }
            if (guesssp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("we have a winner");
                System.out.println("player 1 got right" + p1isRight);
                System.out.println("player 2 got right" + p2isRight);
                System.out.println("player 3 got right" + p3isRight);
                System.out.println("game is over");
                break; //game over so break out of loop
            } else {
                System.out.println("try again");
            }
        }
    }
}
