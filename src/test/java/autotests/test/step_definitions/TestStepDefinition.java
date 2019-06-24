package autotests.test.step_definitions;

import autotests.test.model.common.TestPageModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefinition {
    private TestPageModel testPageModel = new TestPageModel();

    @Then("^user validate Google searchbar is displayed$")
    public void iValidateAmazonSearchbarIsDisplayed() {
        testPageModel.search_bar();

    }

    @When("^user enter text \"([^\"]*)\" to search$")
    public void iEnterTextToSearch(String arg0) throws Throwable {
        testPageModel.search_for_character(arg0);
    }

    @Then("^user validate \"([^\"]*)\"max display limit of Auto Suggest lists for \"([^\"]*)\"$")
    public void userValidateMaxDisplayLimitOfAutoSuggestListsFor(int arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testPageModel.validate_auto_suggest_features_max_result_count(arg0,arg1);
    }

    @Then("^user valiate all suggestion start from character \"([^\"]*)\"$")
    public void userValiateAllSuggestionStartFromCharacter(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testPageModel.validate_auto_suggest_features_result_start_with_charc(arg0);
    }


    @Then("^user validate suggested list for \"([^\"]*)\" same as for character \"([^\"]*)\"$")
    public void userValidateSuggestedListForSameAsForCharacter(String arg0, String arg1) throws Throwable {
        testPageModel.validate_searchA_with_Searcha(arg0,arg1);
    }
}
