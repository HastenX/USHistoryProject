import java.util.ArrayList;
import java.util.Scanner;

public class QuestionList {
    public static ArrayList<String> corrections = new ArrayList<String>();

    private static String answer;
    private static Scanner Input;

    public static int question1() {
        System.out.println(
                """
                        True or False: Communism is objectively bad
                        a) True
                        b) False """);
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if (answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        Although most Americans believe that Communism 
                            has no merrt, this is not an objective truth,
                            but an example of (1) cultural relativism, where
                            we actively impress our values and beliefs onto
                            others and (2) even if Communism has no relative 
                            merit as an economic system, we can still learn 
                            from its shortcomings to make a better world.
                            Therefore, communism is not 'objectively' bad.
                    """);
            return 0;
        }
    }

    public static int question2() {
        System.out.println(
                """
                        True or False: Immigration into the US is
                            something that must be stopped
                        a) True
                        b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        Immigration is what composes American culture.
                            To say that Immigration must be stopped,
                            completely overlooks the value of Immigration
                            to our culture (such as Pizza, Jewish Delis,
                            sushi or Chinese restaurants to list some 
                            examples).
            """);
            return 0;
        }
    }

    public static int question3() {
        System.out.println("""
                True or False: The existence of trans people has
                    been caused by social media
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        Trans people have existed before social media.
                            I would highly recommend researching even
                            a little about other cultures or gender
                            studies to prevent further ignorance on 
                            this topic.
            """);
            return 0;
        }
    }

    public static int question4() {
        System.out.println("""
                True or False: The antagonization of Queer people
                    only effected LGBTQIA+ persons and their 
                    families
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        The level of acceptance a culture has for its
                            minorities demonstrates the level of 
                            acceptance it has for its people. A
                            culture that antagonizes Queer people are
                            less receptive to people that step outside
                            cultural norms-- meaning its not only 
                            expected, but necessitated for men to act 
                            masculine and women to act feminine within
                            such a culture.
            """);
            return 0;
        }
    }

    public static int question5() {
        System.out.println("""
                True or False: Trans people were not involved in
                    the Stonewall protests
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        Trans people were involved in the Stonewall.
                            Trans people have always been apart of the
                            LGBTQIA+ community.
            """);
            return 0;
        }
    }

    public static int question6() {
        System.out.println("""
                True or False: Woodrow Wilson was able to convince
                    Americans against WWI, to volunteer for it--
                    without using propaganda.
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        Wilson needed to convince the masses
                            that WWI needed to be fought.
                            Therefore, he used misinformation (
                            i.e.: describing Germans as "Brutes",
                            therefore dehumanizing them). He
                            used propaganda to do this. 
            """);
            return 0;
        }
    }

    public static int question7() {
        System.out.println("""
                True or False: The US objectively had less 
                    misinformation, by percentage from news
                    outlets of the past, than of today
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        The US did not objectively have less
                            misinformation from the news of 
                            the past. In fact, many outlets
                            reused European newspapers (without
                            fact checking) and even changed some
                            facts and perspectives to better fit
                            the narrative the paper in question 
                            wanted to achieve. Although it is 
                            arguable that more people can state
                            their opinions online, that does not
                            objectively dismiss the amount of 
                            misinformation of the past being larger
                            or lesser than the past.
            """);
            return 0;
        }
    }

    public static int question8() {
        System.out.println("""
                True or False: One of Trump's plans for securing
                    "America's Golden Age" is to maintain the U.S.
                    alliance with NATO and Strengthen our allies
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("B")) {
            return 1;
        } else {
            corrections.add("""
                        Trump has "insulted" our allies, sanctioning
                            tariffs against them and even threatened
                            to revoke military support. He is not
                            Strengthening US allies.
            """);
            return 0;
        }
    }

    public static int question9() {
        System.out.println("""
                True or False: Trans people are not recognized
                    by the US Federal government
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("A")) {
            return 1;
        } else {
            corrections.add("""
                        Trans people are now not recognized by the US 
                            government.This is why this topic is so 
                            important. After Trump's executive order,
                            he made it so that Trans people are no longer 
                            Federally recognized. This caused all 
                            government-run agencies (including NPS) to 
                            change the majority (if not all) referrals to
                            the LGBTQIA+ community as "LGB", ignoring the 
                            intricacies of Gender, Attraction and Sexaulity,
                            and overall-oversimplifying the Queer identity. 
                            This is important because this paves the path
                            for politicians to unrightfully take away even
                            more rights from Trans people and Queer people
                            as a whole.
            """);
            return 0;
        }
    }

    public static int question10() {
        System.out.println("""
                True or False: The anti-vax movement started before 
                    Covid-19 and the "Autism Epidemic"
                a) True
                b) False""");
        Input = new Scanner(System.in);
        answer = Input.nextLine();
        if(answer.toUpperCase().equals("A")) {
            return 1;
        } else {
            corrections.add("""
                        The earliest record of the Anti-vax movement was
                            in the 1800s in the 19th century during the
                            Smallpox epidemic in England. Misinformation
                            is not a new thing, but rather something that 
                            has always existed and must be considered
                            when consuming any media
            """);
            return 0;
        }
    }
}