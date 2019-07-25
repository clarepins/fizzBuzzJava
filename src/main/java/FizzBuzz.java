
public class FizzBuzz {
    public String run(int number) {
        String answer = "";
        if (number % 3 == 0) {
            answer = "fizz";
        } else if (number % 5 == 0) {
            answer = "buzz";
        }
        return answer;
    }


//    public static void main(String[] args) {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        System.out.println(fizzBuzz.run(3));
//    }
}
