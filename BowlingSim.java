
import java.util.Random;
import java.util.ArrayList;
import java.lang.Math;


public class BowlingSim {
    
    Random random = new Random();
    int numOfGames = 10;
    public ArrayList<BowlingGame> gameQueue = new ArrayList<BowlingGame>(numOfGames);

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
        gameQueue.add(new BowlingGame(0, 0, 0, 0, 0, 0, 0, 0));
    }

    //Main Constructor for Driver Program
    public BowlingSim(int numOfGames) {
        this.numOfGames = numOfGames;
        createGames(numOfGames);
    }


    public ArrayList<BowlingGame> getGameQueue(){
        return gameQueue;
    }




    public void createGames(int numOfGames){
        for (int i = 0; i < gameQueue.size(); i++){
            gameQueue.add(
                new BowlingGame(
                        strikeData(),
                        spareData(), 
                        gutterData(), 
                        rentalData(), 
                        splitData(), 
                        missData(), 
                        noSpareData(), 
                        machineFailureData()));
        }
    }


    //Logic for inputting random variables into simulation
    
    public int strikeData(){
        return ((random.nextInt()));
    }

    public int spareData(){
        return ((random.nextInt()));
    }

    public int gutterData(){
        return ((random.nextInt()));
    }

    public int rentalData(){    
        return ((random.nextInt()));
    }

    public int splitData(){
        return ((random.nextInt()));
    }

    public int missData(){
        return ((random.nextInt()));
    }

    public int noSpareData(){
        return ((random.nextInt()));
    }

    public int machineFailureData(){
        return ((random.nextInt()));
    }

    //Balking 
    public int addBalking(){
        return 0;
    }

    public String toString(){
        String fullGames = "";
        for(int i = 0; i < gameQueue.size(); i++){
            fullGames += gameQueue.get(i).toString() + "\n";
        }
        return fullGames;
    }
   
}
