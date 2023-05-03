
import java.util.Random;
import java.util.ArrayList;


public class BowlingSim {
    
    Random random = new Random();
    int numOfPlayers;
    int bowlerNum = 1;

    public ArrayList<Bowler> playerQueue = new ArrayList<Bowler>(numOfPlayers);

    //debugging variables
    int totalStrikes=0;
    int totalSpares=0;
    int totalGB=0;
    int totalSplit=0;
    int totalMiss=0;
    int totalNoSpares=0;
    



    public BowlingSim() {
        //Game Queue with one 'dummy' game placeholder if no games are given
        playerQueue.add(new Bowler(0, 0, 0, 0, 0, 0, 0));
    }

    //Main Constructor for Driver Program
    public BowlingSim(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
        createPlayers(numOfPlayers);
    }


    public ArrayList<Bowler> getPlayerQueue(){
        return playerQueue;
    }




    public void createPlayers(int numOfPlayers){
        for (int i = 0; i < numOfPlayers; i++){
            playerQueue.add(
                new Bowler(
                        bowlerNum,
                        strikeData(),
                        spareData(), 
                        gutterData(),  
                        splitData(), 
                        missData(), 
                        noSpareData()));
                bowlerNum++;
        }
        
    }


    //Logic for inputting random variables into simulation
    
    public int strikeData(){

        //from Pseudocode Dan O. wrote in class
        // 0.0 - 0.22: 0-1 Strikes
        // 0.22 - 0.90: 2-5 Strikes
        // 0.9 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(0,101); //Simulates a random number from 0-100 for determining how many strikes
        int r2 = 0; //This variable will determine the actual number of stikes onces the proper range is determined

        if(r <= 22){ 
            r2 = random.nextInt(0,2); 
        }
         else if (r > 22 && r <= 68){
            r2 = random.nextInt(2,4);
        }  
        else if (r > 68 && r <= 93){
             r2 = random.nextInt(4,6);
        }
         else {
            r2 = random.nextInt(6,9);
            
        }
        totalStrikes += r2;
        return (r2); //Returns the value of number of strikes for a particular bowler in 10 frames
    }

    public int spareData(){

        //from Pseudocode Dan O. wrote in class
        // 0.0 - 0.22: 0-1 Strikes
        // 0.22 - 0.90: 2-5 Strikes
        // 0.9 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(0,101); //Simulates a random number from 0-100 for determining how many strikes
        int r2 = 0; //This variable will determine the actual number of stikes onces the proper range is determined

        if(r <= 24){ 
            r2 = random.nextInt(0,2);
        }
         else if (r > 24 && r <= 70){
            r2 = random.nextInt(2,4);
        }  
        else if (r > 70 && r <= 94){
             r2 = random.nextInt(4,6);
        }
         else {
            r2 = random.nextInt(6,9);
        }
        totalSpares += r2;
        return (r2); //Returns the value of number of strikes for a particular bowler in 10 frames
    }

    public int gutterData(){

        //from Pseudocode Dan O. wrote in class
        // 0.0 - 0.22: 0-1 Strikes
        // 0.22 - 0.90: 2-5 Strikes
        // 0.9 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(0,101); //Simulates a random number from 0-100 for determining how many strikes
        int r2 = 0; //This variable will determine the actual number of stikes onces the proper range is determined

        if(r <= 23){ 
            r2 = random.nextInt(0,2);
        }
         else if (r > 23 && r <= 70){
            r2 = random.nextInt(2,4);
        }  
        else if (r > 70 && r <= 94){
             r2 = random.nextInt(4,6);

        }
         else {
            r2 = random.nextInt(6,9);
        }
        totalGB += r2;
        return (r2); //Returns the value of number of strikes for a particular bowler in 10 frames
    }

    public int splitData(){

        //from Pseudocode Dan O. wrote in class
        // 0.0 - 0.22: 0-1 Strikes
        // 0.22 - 0.90: 2-5 Strikes
        // 0.9 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(0,101); //Simulates a random number from 0-100 for determining how many strikes
        int r2 = 0; //This variable will determine the actual number of stikes onces the proper range is determined

        if(r <= 43){ 
            r2 = random.nextInt(0,2);
        }
         else if (r > 43 && r <= 87){
            r2 = random.nextInt(2,4);
        }  
        else if (r > 87 && r <= 99){
             r2 = random.nextInt(4,6);

        }
         else {
            r2 = random.nextInt(6,9);
        }
        totalSplit += r2;
        return (r2); //Returns the value of number of strikes for a particular bowler in 10 frames
    }
    public int missData(){

        //from Pseudocode Dan O. wrote in class
        // 0.0 - 0.22: 0-1 Strikes
        // 0.22 - 0.90: 2-5 Strikes
        // 0.9 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(0,101); //Simulates a random number from 0-100 for determining how many strikes
        int r2 = 0; //This variable will determine the actual number of stikes onces the proper range is determined

        if(r <= 41){ 
            r2 = random.nextInt(0,2);
        }
         else if (r > 41 && r <= 86){
            r2 = random.nextInt(2,4);
        }  
        else if (r > 86 && r <= 99){
             r2 = random.nextInt(4,6);


        }
         else {
            r2 = random.nextInt(6,9);
        }
        totalMiss += r2;
        return (r2); //Returns the value of number of strikes for a particular bowler in 10 frames
    }

    public int noSpareData(){

        //from Pseudocode Dan O. wrote in class
        // 0.0 - 0.22: 0-1 Strikes
        // 0.22 - 0.90: 2-5 Strikes
        // 0.9 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(0,101); //Simulates a random number from 0-100 for determining how many strikes
        int r2 = 0; //This variable will determine the actual number of stikes onces the proper range is determined

        if(r <= 12){ 
            r2 = random.nextInt(0,2);
        }
         else if (r > 12 && r <= 50){
            r2 = random.nextInt(2,4);
        }  
        else if (r > 50 && r <= 83){
             r2 = random.nextInt(4,6);

        }
         else {
            r2 = random.nextInt(6,9);
        }
        totalNoSpares += r2;
        return (r2); //Returns the value of number of strikes for a particular bowler in 10 frames
    }


    //Balking 
    public int addBalking(){
        return 0;
    }

    public String strikeDebug(){
        return "Total Statistic Distributions:\n" + totalStrikes + ": # of Strikes\n" + totalSpares + ": # of Spares\n" + totalGB + ": # of Gutter Balls\n" 
        + totalSplit + ": # of Splits\n" + totalMiss + ": # of Total Misses\n" + + totalNoSpares + ": # of Frames with no strike or spare\n\n" ;
    }

    public String toString(){
        String allPlayers = "";
        for(int i = 0; i < playerQueue.size(); i++){
            allPlayers += playerQueue.get(i).toString() + "\n";
        }
        return allPlayers;
    }
   
}
