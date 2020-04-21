import java.util.Random;
public class RandomNumbers {
    int temp;
    int min = 30;
    int max = 0;
    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int maxSum = 60;
        while (sum < maxSum) {
            temp = random.nextInt(30); // Returns number between 0-30
            System.out.println("Wylosowana liczba: " + temp);

if(temp < min) { min = temp;} // warunek sprawdzajacy wartosc minimalna
if(temp > max) { max = temp;} // warunek sprawdzajacy wartosc maksymalna

            sum = sum + temp;
            result++;
        }
        return result;
    }
    public int getMin() {
       return min;
    }
    public int getMax() {
        return max;
    }

    public static void main(String[] args) {

        RandomNumbers result = new RandomNumbers(); //New object result

        int rounds = result.getCountOfRandomNumber();  //Number of rounds
        System.out.println("Ilosc wylosowanych liczb: " + rounds);
        int minNumber = result.getMin();
        System.out.println("Wartosc minimalna: " + minNumber);
        int maxNumber = result.getMax();
        System.out.println("Wartosc maksymalna: " + maxNumber);
    }
}
