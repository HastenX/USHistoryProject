import java.util.Scanner;

public class QuestionList {
    private static String answer;
    private static Scanner Input;

    public static int question1() {
        System.out.println(
                """
                        True or False: people in 1920s had to chose
                            between religion or Alcohol
                        a) True
                        b) False """);
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("B") ? 1 : 0;
    }

    public static int question2() {
        System.out.println(
                """
                        True or False: The womens' sufferage movent had
                            nothing to do with the prohibition
                        a) True
                        b) false""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("B") ? 1 : 0;
    }

    public static int question3() {
        System.out.println("""
                True or False: people going to saloons and buying beer,
                    were propigandized as trators to America
                a) True
                b) false""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("A") ? 1 : 0;
    }

    public static int question4() {
        System.out.println("""
                True or False: It was illegal for protesters to protest
                    outside saloons before the Volstead Act
                a) True
                b) false""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("B") ? 1 : 0;
    }

    public static int question5() {
        System.out.println("""
                Who involved the women's sufferage movement into the
                    prohibition
                a) Carrie Nation
                b) Frances Willard
                c) None, it was not involved""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("B") ? 1 : 0;
    }

    public static int question6() {
        System.out.println(
                """
                        what is an example of people  being propigandize
                            against not drinking?
                        a: It was a moral given to not drink and therefore
                            had no propaganda
                        b: It was a legal given to not drink and therefore
                            had no propaganda
                        c: It was forced into the education system""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("C") ? 1 : 0;
    }

    public static int question7() {
        System.out.println(
                """
                        what were the two opposing perspectives on the
                            prohibition generallized to?
                        a: Drunkies v. Sobreity
                        b: Wets v. Dries
                        c: Everyone agreed that drinking was bad""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("B") ? 1 : 0;
    }

    public static int question8() {
        System.out.println(
                """
                        What acts did Carrie Nation do  in protest
                            against Saloons
                        a: She broke into them
                        b: She would protest outside them
                        c: They already all closed""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("A") ? 1 : 0;
    }

    public static int question9() {
        System.out.println(
                """
                        How did the Anti-Saloon League convice people
                            (particularly small towns) against saloons?
                        a: They would all break into saloons and trash
                            the place
                        b: Report misinformation of the affects of
                            alcohol
                        c: Nothing, everybody already hated saloons""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("B") ? 1 : 0;
    }

    public static int question10() {
        System.out.println(
                """
                        How did the Volstead act itself affect the legality
                            of Drinking and how was it enforced
                        a: It did not change the legality of drinking
                            alcohol and therefore was unenforced
                        b: It made drinking alcohol illegal, and much
                            resources were spent ensuring saloons closed
                        c: It drinking alcohol illegal, but it was rarely
                            enforced""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        return answer.toUpperCase().equals("C") ? 1 : 0;
    }
}