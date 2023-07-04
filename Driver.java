package javaAndGitReminder;


public class Driver {
    public static void main(String[] args) {
        
        TalkingDog dog1 = new TalkingDog();
        Martha martha = new Martha();
        dog1.speak();
        martha.speak();
        
    }

    private static class TalkingDog {

        private static final String SPEECH = "RUH ROH";

        public void speak() {
            System.out.println(getSpeech());
        }

        public String getSpeech() {return SPEECH;}

    }

    private static class Martha extends TalkingDog {

        private static final String SPEECH = "Alphabet Soup";

        @Override
        public String getSpeech() {return SPEECH;}

    }

}