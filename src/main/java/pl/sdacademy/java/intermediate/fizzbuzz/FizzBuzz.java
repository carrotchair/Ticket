package pl.sdacademy.java.intermediate.fizzbuzz;

public class FizzBuzz {

    public String playGame(Integer number) {
        if (number == 1) {
            return "1";
        }

        if (number % 15 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

//        static int parseInt(String Object s; );
//        number.toString();
//        int a = Integer.parseInt("20",1);
//        int b = number.parseInt("-F", 16);
//
//        System.out.println(a);
//        System.out.println(b);
}
