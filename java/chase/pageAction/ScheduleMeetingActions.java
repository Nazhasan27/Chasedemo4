package chase.pageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import chase.pageElements.ScheduleMeetingLocators;
import chase.utilities.SetupDrivers;

public class ScheduleMeetingActions {

	ScheduleMeetingLocators ScheduleMeetingLocatorsObj;

	public ScheduleMeetingActions() {

		this.ScheduleMeetingLocatorsObj = new ScheduleMeetingLocators();
		PageFactory.initElements(SetupDrivers.driver, ScheduleMeetingLocatorsObj);
		SetupDrivers.driver.get("https://www.chase.com/");

	}

	public void ChaseHomepage() {
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();

	}

	public void schedMeetingLink() throws Throwable {
		ScheduleMeetingLocatorsObj.schedMeetingLink.click();
		Thread.sleep(2000);
	}

	public void noBtn() throws Throwable {
		ScheduleMeetingLocatorsObj.noBtn.click();
		Thread.sleep(2000);

	}

	public void schedMeetingBtn() throws Throwable {
		ScheduleMeetingLocatorsObj.schedMeetingBtn.click();
		Thread.sleep(2000);

	}

	public void nextBtn() throws Throwable {
		ScheduleMeetingLocatorsObj.nextBtn.click();
		Thread.sleep(2000);

	}

	public void firstName() throws Throwable {
		ScheduleMeetingLocatorsObj.firstName.sendKeys("Elon");
		Thread.sleep(1000);

	}

	public void lastName() throws Throwable {
		ScheduleMeetingLocatorsObj.lastName.sendKeys("Musk");
		Thread.sleep(1000);

	}

	public void email() throws Throwable {
		ScheduleMeetingLocatorsObj.email.sendKeys("ElonMusk123@gmail.com");
		Thread.sleep(1000);

	}

	public void phoneNumber() throws Throwable {
		ScheduleMeetingLocatorsObj.phoneNumber.sendKeys("718-396-3257");
		Thread.sleep(1000);

	}

	public void ddPhoneType() throws Throwable {
		Select PhoneType = new Select(ScheduleMeetingLocatorsObj.phoneType);
		PhoneType.selectByVisibleText("Mobile");
		Thread.sleep(1000);

	}

	public void next2Btn() throws Throwable {
		ScheduleMeetingLocatorsObj.next2btn.click();
		Thread.sleep(1000);

	}

	public void everydayBanking() throws Throwable {
		ScheduleMeetingLocatorsObj.everydayBanking.click();
		Thread.sleep(1000);

	}

	public void learn() throws Throwable {
		ScheduleMeetingLocatorsObj.learn.click();
		Thread.sleep(1000);

	}

	public void next3btn() throws Throwable {
		ScheduleMeetingLocatorsObj.next3btn.click();
		Thread.sleep(1000);

	}

	public void meetByPhone() throws Throwable {
		ScheduleMeetingLocatorsObj.meetByPhone.click();
		Thread.sleep(1000);

	}

	public void areaCode() throws Throwable {
		ScheduleMeetingLocatorsObj.areaCode.sendKeys("11372");
		Thread.sleep(1000);
	}

	public void next4btn() throws Throwable {
		ScheduleMeetingLocatorsObj.next4btn.click();
		Thread.sleep(1000);

	}

	public void ddDate() throws Throwable {
		Select date = new Select(ScheduleMeetingLocatorsObj.date);
		date.selectByVisibleText("Fri, March 26, 2021");
		Thread.sleep(1000);

	}

	public void ddTime() throws Throwable {
		Select time = new Select(ScheduleMeetingLocatorsObj.time);
		time.selectByVisibleText("03:00 PM");
		Thread.sleep(1000);

	}

	public void next5btn() throws Throwable {
		ScheduleMeetingLocatorsObj.next5btn.click();
		Thread.sleep(1000);

	}

	public void checkBox() throws Throwable {
		ScheduleMeetingLocatorsObj.checkBox.click();
		Thread.sleep(1000);

	}
}
