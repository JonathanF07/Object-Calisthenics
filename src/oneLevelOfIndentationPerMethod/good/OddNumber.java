package oneLevelOfIndentationPerMethod.good;

public class OddNumber {    

    private void getRandomNumbers() {
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.random() * 100 + 1;
            numberIsOdd(number);
        }
    }

    private void numberIsOdd(int number) {
        if (number % 2 == 0) {
            showMessage();
        }
    }

    private void showMessage() {
        // No implementation needed
    }

}
