
import java.util.Random;
import java.util.ArrayList;
import java.lang.Math;


public class BowlingSim {
    
    Random random = new Random();
    int numOfPlayers;
    int bowlerNum = 1;

    public ArrayList<Bowler> playerQueue = new ArrayList<Bowler>(numOfPlayers);

    //Min/Max Values for Calculations
    private int strikeMin = 0;
    private int StrikeMax = 10;

    private int spareMin = 0;
    private int spareMax = 10;

    private int gutterMin = 0;
    private int gutterMax = 10;

    private int rentalShoesMin = 0;
    private int rentalShoesMax = 10;

    private int splitMin = 0;
    private int splitMax = 10;

    private int missMin = 0;
    private int missMax = 10;

    private int noSpareMin = 0;
    private int noSpareMax = 10;
    
    private int mechanicalMin = 0;
    private int mechanicalMax = 10;



    public BowlingSim() {
        //Game Queue with one 'dummy' game placeholder if no games are given
        playerQueue.add(new Bowler(0, 0, 0, 0, 0, 0, 0, 0));
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
                        rentalData(), 
                        splitData(), 
                        missData(), 
                        noSpareData()));
                bowlerNum++;
        }
        
    }


    //Logic for inputting random variables into simulation
    
    public int strikeData(){

        //from Pseudocode Dan O. wrote in class 
        int r = random.nextInt(numOfPlayers);
        int r2 = 0;

        if(r <= 22){
            r2 = random.nextInt(2);
        } else if (r > 22 && r <= 63){
            int result = random.nextInt(6);
		        while(result < 2 || result >= 6) {
			        result = random.nextInt(6);
		        }
            r2 = result;
        } else {
            int result = random.nextInt(9);
		        while(result < 6 || result >= 9) {
			        result = random.nextInt(9);
		        }
            r2 = result;

        }

        return (r2);
    }

    public int spareData(){
        return (0);
    }

    public int gutterData(){
        return (0);
    }

    public int rentalData(){    
        return (0);
    }

    public int splitData(){
        return (0);
    }

    public int missData(){
        return (0);
    }

    public int noSpareData(){
        return (0);
    }


    //Balking 
    public int addBalking(){
        return 0;
    }

    public String toString(){
        String allPlayers = "";
        for(int i = 0; i < playerQueue.size(); i++){
            allPlayers += playerQueue.get(i).toString() + "\n";
        }
        return allPlayers;
    }
   
}
