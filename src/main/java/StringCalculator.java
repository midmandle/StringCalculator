public class StringCalculator {
    public int add(String numbers) {
        if (numbers.length() == 1) {
            int number = Integer.parseInt(numbers);
            return number;
        }
        return 0;
    }
}
