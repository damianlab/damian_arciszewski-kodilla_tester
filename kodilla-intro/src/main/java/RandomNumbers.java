import java.util.Random;
public class RandomNumbers {
    int temp;
    int min = 30;
    int max = 0;
    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int maxSum = 5001;
        while (sum < maxSum) {
            temp = random.nextInt(30); // Returns number between 0-30
            sum = sum + temp;
            result++;
        }
        return result;
    }
    public int getMin() {
        if(temp < min) { min = temp; }

        return min;
    }
    public int getMax() {
        if(temp > max) { max = temp; }

        return max;
    }

    public static void main(String[] args) {

        RandomNumbers result = new RandomNumbers(); //New object result

        int rounds = result.getCountOfRandomNumber();  //Number of rounds
        System.out.println(rounds);
        int minNumber = result.getMin();
        System.out.println(minNumber);
        int maxNumber = result.getMax();
        System.out.println(minNumber);
    }
}
// End
//Powyższa metoda zwraca liczbę losowań liczb z zakresu 0 do 9, których suma nie przekracza wartości max.
// Nowe elementy to utworzenie obiektu typu Random: Random random = new Random(); oraz wylosowanie liczby z zakresu 0 do 9: random.nextInt(10).
// Liczba 10 to górny zakres, nigdy nie zostanie wylosowana. Liczby losujemy tak długo, aż ich suma przekroczy wartość max,
// wtedy przerywamy i zwracamy liczbę losowań.

    /*public static void main(String[] args) {
        int i;
        i = 1;
        while(i <=30) {
        //for (int i = 1; i <= 10; i++)// 10 losowych wartosci, zaczynamy od 1 i odliczamy do 10
      //  {
            double x = Math.random(); //liczba po przecinku
            int xNew = (int)(x*10); // zamiana na liczbe calkowita
           // xNew = Math.max(xNew, 4); //wyznaczmy max z dwoch wartosci
           // xNew = Math.min(xNew, 6); //wyznaczmy max z dwoch wartosci
            System.out.println("Dla licznika: " + i + "Wartosc: " + xNew);
            i++;
        }


    }
}*/
        /*
    }
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
} */