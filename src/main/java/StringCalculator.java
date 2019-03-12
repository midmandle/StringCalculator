public class StringCalculator {
    public int add(String numbers) {

        if (numbers.isEmpty()) return 0;

        String[] numbersAsStrings = numbers.split(",|\n");

        int total = 0;

        for (String number : numbersAsStrings) {
            total += convertStringToNumber(number);
        }

        return total;
    }

    private int convertStringToNumber(String number) {
        return Integer.parseInt(number);
    }
}
