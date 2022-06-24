/*
 *This class will compute the total sum given an initial and a weekly increment and the number of weeks.
 Were using arithmetic series to solve the problem
 The formula: an=a1+(n-1)d
 where an is the total, a1 is the initial amount, n is the number of weaks and d is the increment
 Written by Jai S

 */

public class ArithmeticProgression {
    public ArithmeticProgression() {
    }

    public static void main(String args[]) {

        ArithmeticProgression myObject = new ArithmeticProgression();
        int answer = 0;
        // sample values for testing
        int sampleInitialAmount=10;
        int sampleIncrement=2;
        int sampleNumberOfWeek=5;

        answer = myObject.arithmeticProgression(sampleInitialAmount,sampleIncrement,sampleNumberOfWeek);

        System.out.println("the answer is" + answer);

    }

    public int arithmeticProgression(int initialAmount, int weeklyIncrement, int mumberOfWeeks) {
        int a1 = initialAmount;
        int d = weeklyIncrement;
        int n = mumberOfWeeks;
        int sum = 0;
        sum = a1 + (n - 1) * d;
        return sum;
        // System.out.println("the answer is"+sum);

    }

}
