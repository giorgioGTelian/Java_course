 player class GuessGame {
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
    }
}
