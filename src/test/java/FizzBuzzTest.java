import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() {
        int number = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.run(number);

        assertThat(answer, is("fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsMultipleOf5() {
        int number = 5;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.run(number);

        assertThat(answer, is("buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsMultipleOf15() {
        int number = 15;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.run(number);

        assertThat(answer, is("fizz buzz"));
    }

    @Test
    public void shouldReturnNumberIfItIsNotAMultipleOf3Or5() {
        int number = 7;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.run(number);

        assertThat(answer, is("7"));
    }

}