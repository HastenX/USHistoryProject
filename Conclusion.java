public class Conclusion {
    public static void results(String name, int correct) {
        System.out.println(name + "'s Test Data: ");
        System.out.println("You got " + correct + " out of 10 right!");
        System.out.println("Score: " + (correct * 10) + "%");
    }
}
