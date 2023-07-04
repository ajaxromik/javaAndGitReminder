package javaAndGitReminder;

/**
 * For some reason, I couldn't remember how it worked, so I programmed it and made a repo along the way.
 * Not really useful, just a good reminder for myself.
 * DISCLAIMER: I don't own anything here, just the fact that I typed it out.
 * @version 7.4.2023
 * @author William Carr
 */
public class Driver {

    /**
     * Tests my little program
     * @param args Arguments if you would
     */
    public static void main(String[] args) {

        TalkingDog dog1 = new TalkingDog();
        Martha martha = new Martha();

        dog1.speak();
        martha.speak();
        
    }

    /**
     * Test superclass that creates a speak method calling another method.
     * The question was whether it would use the sub or superclass implementation.
     * Kinda embarassing to forget, but I don't mind the little exercise.
     */
    private static class TalkingDog {

        private static final String SPEECH = "RUH ROH"; //random dog speech

        /**
         * Calls another method inside of the method to see what would happen when the subclass does it.
         */
        public void speak() {
            System.out.println(getSpeech());
        }

        /**
         * Returns the speech
         * @return The speech constant
         */
        public String getSpeech() {return SPEECH;}

    }

    /**
     * Test subclass for this experiment.
     */
    private static class Martha extends TalkingDog {

        private static final String SPEECH = "Alphabet Soup"; //get the reference?

        /**
         * Same as the super.
         */
        @Override
        public String getSpeech() {return SPEECH;}

    }

}