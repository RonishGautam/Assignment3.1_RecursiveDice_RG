import java.util.Random;

/**
 * The RecDieRoller class simulates the rolling of a six-sided die.
 * It uses a recursive approach to roll the die until a 2 is rolled.
 */
public class RecDieRoller {

    private Random rand;

    /**
     * Initializes a new RecDieRoller with a fresh random number generator.
     */
    public RecDieRoller() {
        this.rand = new Random();
    }

    /**
     * This method uses a recursive. Each roll is printed to the console.
     * The return value represents the number of rolls taken to get a 2.
     * 
     * @return The number of times the die was rolled to get a 2.
     */
    public int recursiveroll() {
        int result = rand.nextInt(6) + 1;// Random number between 1 and 6
        System.out.println("Rolled: " + result);
        
        
        if (result != 2) {
            return 1 + recursiveroll(); // add 1 to the count for this roll, then add the counts of further rolls
        } else {
            return 1; // if it's a 2, we return 1.        }
    }
}
}