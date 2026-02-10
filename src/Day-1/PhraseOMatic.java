public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = { "agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed" };

        String[] wordListTwo = { "zero tolerance", "dynamic", "universal", "solution-oriented", "24/7", "end-to-end",
                "global",
                "cross-platform", "multi-tiered", "broad-based", "solid state" };

        String[] wordListThree = { "web-enabled", "pervasive", "smart", "seamless", "extensible", "turn-key",
                "world-class", "robust", "scalable", "frictionless", "viral", "sticky" };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}