public class StringCalculator {
    public int add(String numbers) {
        if (numbers.length() == 1) {
            int number = Integer.parseInt(numbers);
            return number;
        }
        if(numbers.length() == 3) {
            int number1 = Integer.parseInt(String.valueOf(numbers.charAt(0)));
            int number2 = Integer.parseInt(String.valueOf(numbers.charAt(2)));
            return number1 + number2;
        }
        return 0;
    }
}
