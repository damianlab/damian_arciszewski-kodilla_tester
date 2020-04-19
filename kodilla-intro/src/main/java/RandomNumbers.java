import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int maxNumber = 0;
        int minNumber = 0;
        int max = 5000 + 1;
        while(sum<max) {
            int randomNumber = random.nextInt(30);
            sum = sum + randomNumber;
            if(maxNumber>=randomNumber){
                maxNumber = maxNumber + randomNumber;
                maxNumber++;
            } else if(minNumber<=randomNumber) {
                minNumber = minNumber + randomNumber;
                minNumber++;
            }
        }
        System.out.println(maxNumber);
        System.out.println(minNumber);

    }
}