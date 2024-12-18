public class InitalizeQuestions {
    public static int getQuestion(int question) {
        switch (question) {
            case 1:
                return QuestionList.question1();
            case 2:
                return QuestionList.question2();

            case 3:
                return QuestionList.question3();

            case 4:
                return QuestionList.question4();
            case 5:
                return QuestionList.question5();

            case 6:
                return QuestionList.question6();

            case 7:
                return QuestionList.question7();

            case 8:
                return QuestionList.question8();

            case 9:
                return QuestionList.question9();

            case 10:
                return QuestionList.question10();
            default:
                return 0;
        }
    }
}
