package HeadFirst.ch1;

import java.util.concurrent.ThreadLocalRandom;

public class PhraseOMatic {
    private static String string;

    public static void main(String[] args) {

        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven",
                "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};

        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository",
                "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();

        //int rnd = ThreadLocalRandom.current().nextInt(oneLength);
        int rnd = ThreadLocalRandom.current().nextInt(0,10);
        int rnd1 = ThreadLocalRandom.current().nextInt(twoLength);
        int rnd2 = ThreadLocalRandom.current().nextInt(threeLength);
        string = wordListOne[rnd] + " " + wordListTwo[rnd1] + " " + wordListThree[rnd2];
        System.out.println("What we need is a " + string);

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
