public class FizzBuzz {
    public String run(int number) {
        String answer = "";
        if (number % 15 == 0) {
            answer = "fizz buzz";
        } else if (number % 3 == 0) {
            answer = "fizz";
        } else if (number % 5 == 0) {
            answer = "buzz";
        } else {
            answer = Integer.toString(number);
        }
        return answer;
    }


//    public static void main(String[] args) {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        System.out.println(fizzBuzz.run(30));
//    }
}
