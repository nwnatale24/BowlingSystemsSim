import java.util.Scanner;


public class BowlingDriver {

    
    

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int playerNum = 0;


        //Test Sim
        System.out.println("====== Bowler Simulator! ======");
        System.out.println("Enter # of Bowlers to simulate:");
        playerNum = sc.nextInt();

        

        BowlingSim bowlingSim = new BowlingSim(playerNum);
        System.out.println(bowlingSim.toString());
        


    }
}
