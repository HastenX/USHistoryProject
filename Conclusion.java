import java.util.ArrayList;

public class Conclusion {
    public static void results(String name, int correct, ArrayList<Integer> questionOrder) {
        System.out.println(name + "'s Test Data: ");
        System.out.println("You got " + correct + " out of 10 right!");
        System.out.println("Score: " + (correct * 10) + "%");
        if(correct == 10) {
            System.out.println("Congrants on the perfect score! Theres hope against misinformation after all :)");
        } else {
            System.out.println("This is what you got wrong: ");
            for(String i : QuestionList.corrections) {
                System.out.println(i);
            }
        }
    }
}
