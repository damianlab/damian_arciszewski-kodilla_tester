package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
 // Aby uzyc metody sum(int a, int b) wymagane jest stworzyc obiekt

 Calculator calculator = new Calculator();
 int a = 5;
 int b = 8;
 double c = 5;
 double d = 2;
 int sumResult = calculator.sum(a, b); // Nowa zmienna wywolujaca sume z ckasy kalkulator. Obliczenie ktore sprawdzamy
 boolean correct = ResultChecker.assertEquals(14, sumResult); // Nowa zmienna typu boolean odpowiadajaca za porownanie wyniku obliczonego przez kod z wynikiem oczekiwanym.
 int subtractResult = calculator.subtract(a, b);
 boolean correctSubtract = ResultChecker.assertEqualsSecond(-3, subtractResult);
 double squareResult = calculator.square(c, d);
 boolean correctSquare = ResultChecker.assertEqualsSquare(25, squareResult);

        if (correct) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSubtract) {
            System.out.println("Metoda subtract dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSquare) {
            System.out.println("Metoda square dziala poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + c);
        }
        /*
        System.out.println("Suma obliczenia z klasy: " + sumResult);
        System.out.println("Wynik z metody boolean sum: " + correct);
        System.out.println("Wynik odejmowania z klasy: " + subtractResult);
        System.out.println("Wynik z metody boolean dla subtract: " + correctSubtract); */
    }
}
