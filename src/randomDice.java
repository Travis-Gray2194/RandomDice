//Travis Gray
//Complete the following program so that it creates a random die roll (random numbers from 1 to 6).
import java.util.Random;//imports random number generator

public class randomDice {

    public static void main(String args[]) {
        int dienumber;//stores number for dice roll
        Random rnd = new Random();//Dice object for random numbers

//Roll dice 15 times and increase by 1 each time
        for (int counter = 1; counter <= 15; counter++) {//Start For Loop
 //Using dice  object to get numbers//
            dienumber = 1+rnd.nextInt(6);//Giving dice option 6 sides (by adding plus one)
            System.out.println("Your die roll was : " + dienumber);


        }//End For Loop


    }
}
