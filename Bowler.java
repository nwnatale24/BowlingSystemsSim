//Bowler Class

public class Bowler{
    public int bowlerid;
    public int strikes;
    public int spares;
    public int gutter_balls;
    public int split_pins;
    public int misses;
    public int no_spares;
    

    public Bowler(int bowlerid, int strikes, int spares, int gutter_balls, int split_pins, int misses, int no_spares){
        this.bowlerid = bowlerid;
        this.strikes = strikes;
        this.spares = spares;
        this.gutter_balls = gutter_balls;
        this.split_pins = split_pins;
        this.misses = misses;
        this.no_spares = no_spares;
    }

    public int getBowlerID(){
        return bowlerid;
    }

    public int getStrikes(){
        return strikes;
    }

    public int getSpares(){
        return spares;
    }

    public int getGutters(){
        return gutter_balls;
    }

    public int getSplits(){
        return split_pins;
    }

    public int getMisses(){
        return misses;
    }

    public int getNoSpares(){
        return no_spares;
    }


    public String toString(){
        return (
        "====== Bowler # " + bowlerid + " stats ======\n\n" + 
        "Strikes: " + strikes + "\n" +
        "Spares: " + spares + "\n" +
        "Gutter Balls: " + gutter_balls + "\n" + 
        "Splits: " + split_pins + "\n" +
        "Misses: " + misses + "\n" +
        "Turns with no spares: " + no_spares + "\n");
    }

}