
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    private int i;
    private String name;
    public int correct;
    public ArrayList<Integer> questionOrder;
    private Scanner getName;

    public Test() {
        System.out.println("Please enter your name: ");
        getName = new Scanner(System.in);
        this.name = getName.nextLine();

        this.questionOrder = new ArrayList<Integer>();
        for (i = 0; i <= 10; i++) {
            this.questionOrder.add(i);
        }
        Collections.shuffle(this.questionOrder);

        for (i = 0; i <= 10; i++) {
            this.correct += InitalizeQuestions.getQuestion(this.questionOrder.get(i));
        }
        Conclusion.results(this.name, this.correct);
    }
}
