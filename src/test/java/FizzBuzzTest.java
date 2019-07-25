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

}