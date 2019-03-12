public class StringCalculator {
    public int add(String numbers) {

        if (numbers.isEmpty()) return 0;

        String[] numbersAsStrings = numbers.split(",");

        int total = 0;

        if (numbersAsStrings.length == 1) {
            total += Integer.parseInt(numbers);
        }

        if (numbersAsStrings.length >= 2){
            total += convertStringToNumber(numbersAsStrings[0]);
            total += convertStringToNumber(numbersAsStrings[1]);
        }

        if (numbersAsStrings.length == 3){
            total += convertStringToNumber(numbersAsStrings[2]);
        }

        return total;
    }

    private int convertStringToNumber(String number) {
        return Integer.parseInt(number);
    }
}
