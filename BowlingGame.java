public class BowlingGame{
    public int strikes;
    public int spares;
    public int gutter_balls;
    public int rental_shoes;
    public int split_pins;
    public int misses;
    public int no_spares;
    public int machine_failures;

    public BowlingGame(int strikes, int spares, int gutter_balls, int rental_shoes, int split_pins, int misses, int no_spares, int machine_failures){
        this.strikes = strikes;
        this.spares = spares;
        this.gutter_balls = gutter_balls;
        this.rental_shoes = rental_shoes;
        this.split_pins = split_pins;
        this.misses = misses;
        this.no_spares = no_spares;
        this.machine_failures = machine_failures;
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

    public int getRentals(){
        return rental_shoes;
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

    public int getMachineFailures(){
        return machine_failures;
    }

    public String toString(){
        return (
        "Strikes: " + strikes + "\n" +
        "Spares: " + spares + "\n" +
        "Gutter Balls: " + gutter_balls + "\n" +
        "Rental Shoes: " + rental_shoes + "\n" + 
        "Splits: " + split_pins + "\n" +
        "Misses: " + misses + "\n" +
        "Turns with no spares: " + no_spares + "\n" +
        "Mechanical Failures: " + machine_failures + "\n");
    }

}