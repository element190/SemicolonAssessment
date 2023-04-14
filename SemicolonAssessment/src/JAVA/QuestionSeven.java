package JAVA;

public class QuestionSeven {

    public static void main(String[] args) {


        int denominator;
        double result = 4.0;
        double counterCorrect = 3.14159;

        System.out.printf("%3s\t%10s%n", "Counter", "Value");

        for (int i = 0; i <= 200000; i++) {
            denominator = i * 2 + 3;

            if (i % 2 == 0) {
                result -= 4.0 / denominator;
            } else {
                result += 4.0 / denominator;
            }

            System.out.printf("%3d\t%7s%.15f%n", i, " ", result);

        }
        if(result == counterCorrect){
            System.out.printf("counter:%d",result);
        }
    }
}
