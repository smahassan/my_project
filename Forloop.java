public class Forloop {

    public static String showNumberTables(int maxi) {
        String answer = "";

        for (int i = 0; i <= maxi; i++) {
            answer += "Answer is " + i + "\n";
            // or like this       answer= answer + "Answer is " + i +"\n";
        }

        return answer;
    }

    public static String showTimesTables(int maxi, int number) {
        String answer = "";
        for (int i = 0; i <= maxi; i++) {
            answer += number + " X " + i + " = " + (number * i) + "\n";
            // or like this
//             answer= answer + "Answer is " + i +"\n";
        }
        return answer;

    }

    public static int ArithProgression() {
        int answer = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 5==0){
                answer+= i;
            }
                }
        return answer;

    }

        public static void main (String[] args){
           System.out.println(showNumberTables(20));
           //changes
           System.out.println(showTimesTables(5, 7));
            System.out.println(ArithProgression());

        }

}