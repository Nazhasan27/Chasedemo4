package chase.stepDef;

import cucumber.api.java.en.*;
import chase.pageAction.JobFilterActions;
import chase.pageAction.MortgageCalcActions;

public class JobFilterSteps {

	JobFilterActions JobFilterActionsObj = new JobFilterActions();
	MortgageCalcActions MortgageCalcActionsObj = new MortgageCalcActions();
	

	@When("^user click on career$")
	public void user_click_on_career() throws Throwable {
		JobFilterActionsObj.careersLink();

	}

	@When("^user clicks on explore opportunities$")
	public void user_clicks_on_explore_opportunities() throws Throwable {
		JobFilterActionsObj.exploreOpp();

	}

	@When("^user clicks on view all jobs$")
	public void user_clicks_on_view_all_jobs() throws Throwable {
		JobFilterActionsObj.viewAllJobs();

	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String Role) throws Throwable {
		JobFilterActionsObj.jobSearchBar(Role);

	}
	
	@Then("^verify by \"([^\"]*)\" results$")
	public void verify_by_results(String Role) throws Throwable {
		JobFilterActionsObj.VerifyZipcode(Role);

	}
}
