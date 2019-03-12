public class StringCalculator {
    public int add(String numbers) {

        if (numbers.isEmpty()) return 0;

        String[] numbersAsStrings = numbers.split(",");

        if (numbersAsStrings.length == 1) {
            int number = Integer.parseInt(numbers);
            return number;
        }

        int number1 = Integer.parseInt(numbersAsStrings[0]);
        int number2 = Integer.parseInt(numbersAsStrings[1]);

        return number1 + number2;
    }
}
