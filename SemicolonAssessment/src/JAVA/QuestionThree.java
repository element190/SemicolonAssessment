package JAVA;

public class QuestionThree {

    public static void main(String[] args) {
        String word = "VENTURES";
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
                if(i % 2==1){
                    System.out.println(" ");

                }
            }
        }
    }
