package numberchecker;

import io.cucumber.java8.En;
import numberChecker.NumberChecker;

import static org.junit.Assert.assertEquals;

public class IsItDivisibleByNumberSteps implements En {
    private int number;
    private String answer;

    public IsItDivisibleByNumberSteps() {
        Given("Game has a 12", () -> {
            this.number = 12;
        });
        Given("Game has a 30", () -> {
            this.number = 30;
        });
        Given("Game has a 5", () -> {
            this.number = 5;
        });
        Given("Game has a 8", () -> {
            this.number = 8;
        });

        When("Checking if number is divisible by 3 and 5", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("Game should return {string}", (String string) -> {
            assertEquals(string, this.answer);
        });
    }
}

