/**
 * It rolls a die 1,000 times, and calculates and prints the average number of rolls it took to get a 2.
 */
public class RecDieRollerDriver {

    /**
       * After all rolls, it calculates and displays the average number of rolls needed to get a 2.

     */
    public static void main(String[] args) {
        RecDieRoller Roller = new RecDieRoller();

     // Number of rolls accumulated over all trials.
        int Rolls = 0;

        // The number of trials to conduct for rolling the die.
        int trys = 1000;

        // Conduct the trials by rolling the die and accumulating the results.
        for (int i = 0; i < trys; i++) {
            Rolls += Roller.recursiveroll();
        }

        // Calculate the mean rolls required to get a 2.
        double mean = (double) Rolls / trys;

        // Print out the mean result.
        System.out.println("The mean number of rolls to get a 2 is: " + mean);

    }
}
