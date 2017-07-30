package dontUseElseKeyword.bad;

public class Screen {

    public void onNextClicked() {
        String companyName = getValueFromInput();
        if (!companyName.isEmpty()) {
            if (isNetworkAvailable()) {
                getCompanyFromServer(companyName);
            } else {
                showNetworkError();
            }
        } else {
            showValidationMessage();
        }
    }

    private void showValidationMessage() {
        // No implementation needed
    }

    private void showNetworkError() {
        // No implementation needed
    }

    private void getCompanyFromServer(String companyName) {
        // No implementation needed
    }

    private boolean isNetworkAvailable() {
        // No implementation needed
        return false;
    }

    private String getValueFromInput() {
        // No implementation needed
        return null;
    }

}
