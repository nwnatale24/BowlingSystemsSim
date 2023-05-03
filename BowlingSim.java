
import java.util.Random;
import java.util.ArrayList;
import java.lang.Math;


public class BowlingSim {
    
    Random random = new Random();
    int numOfPlayers;
    int bowlerNum = 1;

    public ArrayList<Bowler> playerQueue = new ArrayList<Bowler>(numOfPlayers);

    //debugging variables
    int zeroToOne = 0;
    int twoToFive = 0;
    int sixToNine = 0;
    



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
        // 0.22 - 0.63: 2-5 Strikes
        // 0.63 - 1.0: 6-9 Strikes

        

        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
            zeroToOne++;
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
            twoToFive++;
            
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;
            sixToNine++;

        }
        
        return (r2);
    }

    public int spareData(){

        //if statements need to have changed values for data
        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
            zeroToOne++;
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
            twoToFive++;
            
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;
            sixToNine++;

        }
        
        return (r2);
    }

    public int gutterData(){
        
        //if statements need to have changed values for data
        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
            zeroToOne++;
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
            twoToFive++;
            
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;
            sixToNine++;

        }
        
        return (r2);
    }

    public int splitData(){
        
        //if statements need to have changed values for data
        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
            zeroToOne++;
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
            twoToFive++;
            
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;
            sixToNine++;

        }
        
        return (r2);
    }

    public int missData(){

        //if statements need to have changed values for data
        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
            zeroToOne++;
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
            twoToFive++;
            
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;
            sixToNine++;

        }
        
        return (r2);
    }

    public int noSpareData(){
        
        //if statements need to have changed values for data
        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
            zeroToOne++;
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
            twoToFive++;
            
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;
            sixToNine++;

        }
        
        return (r2);
    }


    //Balking 
    public int addBalking(){
        return 0;
    }

    public String strikeDebug(){
        return "Strike Distributions:\n" + zeroToOne + ": 1-2 Strikes\n" + twoToFive + ": 2-5 Strikes\n" + sixToNine + ": 6-9 Strikes\n\n";
    }

    public String toString(){
        String allPlayers = "";
        for(int i = 0; i < playerQueue.size(); i++){
            allPlayers += playerQueue.get(i).toString() + "\n";
        }
        return allPlayers;
    }
   
}
