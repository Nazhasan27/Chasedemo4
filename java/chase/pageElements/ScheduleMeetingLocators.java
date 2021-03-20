package chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduleMeetingLocators {

	@FindBy(xpath = "//a[contains(text(),'Schedule a Meeting')]")
	public WebElement schedMeetingLink;

	@FindBy(xpath = "//body/div[1]/div[5]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	public WebElement noBtn;

	@FindBy(xpath = "//input[@id='input-option-schedule-meeting']")
	public WebElement schedMeetingBtn;

	@FindBy(xpath = "//button[@id='get_started_managemeeting_next']")
	public WebElement nextBtn;

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='emailAddress']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//select[@id='phoneType']")
	public WebElement phoneType;

	@FindBy(xpath = "//button[@id='next_button']")
	public WebElement next2btn;
	
	@FindBy(xpath = "//span[contains(text(),'Everyday banking')]")
	public WebElement everydayBanking;
	
	@FindBy(xpath = "//input[@id='input-option-radiobutton__SERVICE_EXISTING_ACCOUNT_SOMETHING_ELSE']")
	public WebElement learn;
	
	@FindBy(xpath = "//button[@id='next_button']")
	public WebElement next3btn;
	
	@FindBy(xpath = "//input[@id='input-option-phoneMeeting}']")
	public WebElement meetByPhone;
	
	@FindBy(xpath = "//input[@id='postalAreaCode']")
	public WebElement areaCode;
	
	@FindBy(xpath = "//button[@id='meetingType__next_button']")
	public WebElement next4btn;
	
	@FindBy(xpath = "//select[@id='chooseadate']")
	public WebElement date;
	
	@FindBy(xpath = "//select[@id='chooseatime']")
	public WebElement time;

	
	@FindBy(xpath = "//button[@id='meetingTime_next_button']")
	public WebElement next5btn;
	
	@FindBy(xpath = "//input[@id='phone-reminder-checkbox']")
	public WebElement checkBox;
}