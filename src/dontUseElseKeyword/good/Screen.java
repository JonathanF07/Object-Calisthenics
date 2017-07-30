package dontUseElseKeyword.good;

public class Screen {

    public void onNextClicked() {
        String companyName = getValueFromInput();
        validateValue(companyName);
        validateNetowrkAvaliability();
        getCompanyFromServer(companyName);
    }

    private void showNetworkError() {
        throw new IllegalArgumentException(
                "You don't have a network connection to access this data.");
    }

    private void validateValue(String value) {
        if (value.isEmpty()) {
            showValidationMessage();
        }
    }

    private void validateNetowrkAvaliability() {
        if (!isNetworkAvailable()) {
            showNetworkError();
        }

    }

    private void getCompanyFromServer(String companyName) {
        // No implementation needed
    }

    private boolean isNetworkAvailable() {
        // No implementation needed
        return false;
    }

    private void showValidationMessage() {
        // No implementation needed
    }

    private String getValueFromInput() {
        // No implementation needed
        return null;
    }

}
