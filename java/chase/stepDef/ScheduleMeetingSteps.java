package chase.stepDef;

import cucumber.api.java.en.*;
import chase.pageAction.ScheduleMeetingActions;

public class ScheduleMeetingSteps {

	ScheduleMeetingActions ScheduleMeetingActionsObj = new ScheduleMeetingActions();
	
	@When("^user selects Schedule A Meeting$")
	public void user_selects_Schedule_A_Meeting() throws Throwable {
		ScheduleMeetingActionsObj.schedMeetingLink();
	}

	@When("^user is not a Chase customer$")
	public void user_is_not_a_Chase_customer() throws Throwable {
		ScheduleMeetingActionsObj.noBtn();
	}

	@When("^user selects radio buttion for Schedule a meeting$")
	public void user_selects_radio_buttion_for_Schedule_a_meeting() throws Throwable {
		ScheduleMeetingActionsObj.schedMeetingBtn();
		ScheduleMeetingActionsObj.nextBtn();
	}

	@When("^user enters required info$")
	public void user_enters_required_info() throws Throwable {
		ScheduleMeetingActionsObj.firstName();
		ScheduleMeetingActionsObj.lastName();
		ScheduleMeetingActionsObj.email();
		ScheduleMeetingActionsObj.phoneNumber();
		ScheduleMeetingActionsObj.ddPhoneType();
		ScheduleMeetingActionsObj.next2Btn();
		ScheduleMeetingActionsObj.everydayBanking();
		ScheduleMeetingActionsObj.learn();
		ScheduleMeetingActionsObj.next3btn();
		ScheduleMeetingActionsObj.meetByPhone();
		ScheduleMeetingActionsObj.areaCode();
		ScheduleMeetingActionsObj.next4btn();
		ScheduleMeetingActionsObj.ddDate();
		ScheduleMeetingActionsObj.ddTime();
		ScheduleMeetingActionsObj.next5btn();
		ScheduleMeetingActionsObj.checkBox();
		
	    
	}

	@Then("^user can proceed with confirmation$")
	public void user_can_proceed_with_confirmation() throws Throwable {
	   
	}

}