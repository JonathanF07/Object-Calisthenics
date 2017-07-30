package oneLevelOfIndentationPerMethod.bad;

public class OddNumber {

    public void isOdd() {
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.random() * 100 + 1;
            if (number % 2 == 0) {
                showMessage();
            }
        }
    }

    private void showMessage() {
        // No implementation needed
    }

}
