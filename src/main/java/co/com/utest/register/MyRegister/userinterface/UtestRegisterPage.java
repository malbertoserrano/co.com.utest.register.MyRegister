package co.com.utest.register.MyRegister.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class UtestRegisterPage {

    public static final Target FIRST_NAME_TXTBOX = Target.the("Textbox to input first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_TXTBOX = Target.the("Textbox to input last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_TXTBOX = Target.the("Textbox to input email")
            .located(By.id("email"));
    public static final Target DB_MONTH = Target.the("List to select month of birth")
            .located(By.xpath("//select[@id=\"birthMonth\"]//option[@label=\"September\"]"));
    public static final Target DB_DAY = Target.the("List to select day of birth")
            .located(By.xpath("//select[@id=\"birthDay\"]//option[@label=\"26\"]"));
    public static final Target DB_YEAR = Target.the("List to select year of birth")
            .located(By.xpath("//select[@id=\"birthYear\"]//option[@label=\"1997\"]"));
    public static final Target NEXT_LOCATION = Target.the("Go to the next data to register: Location")
            .located(By.xpath("//a[@class=\"btn btn-blue\"]"));
    public static final Target LOCATION_CITY = Target.the("Textbox to input city")
            .located(By.id("city"));
    public static final Target LOCATION_ZIP = Target.the("Textbox to input Zip Code")
            .located(By.id("zip"));
    public static final Target LOCATION_COUNTRY_SELECT = Target.the("Textbox to input Country")
            .located(By.xpath("//div[@class=\"ui-select-match\" and  @placeholder=\"Select a country\"]"));
    public static final Target LOCATION_COUNTRY_TEXTBOX = Target.the("Textbox to input Country")
            .located(By.xpath("//input[@type=\"search\" and  @placeholder=\"Select a country\"]"));
   public static final Target NEXT_DEVICES = Target.the("Go to the next data to register: Devices")
            .located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));
    public static final Target DEVICE_COMPUTER = Target.the("Textbox to Input OS Device")
            .located(By.xpath("(//div[@id=\"web-device\"]//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]"));
    public static final Target DEVICE_COMPUTER_TXTBOX = Target.the("Textbox to Input OS Device")
            .located(By.xpath("(//div[@id=\"web-device\"]//input[@type=\"search\"])[1]"));
    public static final Target DEVICE_VERSION = Target.the("Textbox to Input OS Version")
            .located(By.xpath("(//div[@id=\"web-device\"]//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]"));
    public static final Target DEVICE_VERSION_TXTBOX = Target.the("Textbox to Input OS Version")
            .located(By.xpath("(//div[@id=\"web-device\"]//input[@type=\"search\"])[2]"));
    public static final Target DEVICE_LANGUAGE = Target.the("Textbox to Input OS Language")
            .located(By.xpath("(//div[@id=\"web-device\"]//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]"));
    public static final Target DEVICE_LANGUAGE_TXTBOX = Target.the("Textbox to Input OS Language")
            .located(By.xpath("(//div[@id=\"web-device\"]//input[@type=\"search\"])[3]"));
    public static final Target DEVICE_MOBILE = Target.the("Textbox to Input a mobile device")
            .located(By.xpath("(//div[@id=\"mobile-device\"]//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]"));
    public static final Target DEVICE_MOBILE_TXTBOX = Target.the("Textbox to Input a mobile device")
            .located(By.xpath("(//div[@id=\"mobile-device\"]//input[@type=\"search\"])[1]"));
    public static final Target DEVICE_MODEL = Target.the("Textbox to Input a model mobile")
            .located(By.xpath("(//div[@id=\"mobile-device\"]//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]"));
    public static final Target DEVICE_MODEL_TXTBOX = Target.the("Textbox to Input a model mobile")
            .located(By.xpath("(//div[@id=\"mobile-device\"]//input[@type=\"search\"])[2]"));
    public static final Target DEVICE_MOBILE_OS = Target.the("Textbox to Input mobile OS ")
            .located(By.xpath("(//div[@id=\"mobile-device\"]//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]"));
    public static final Target DEVICE_MOBILE_OS_TXTBOX = Target.the("Textbox to Input mobile OS ")
            .located(By.xpath("(//div[@id=\"mobile-device\"]//input[@type=\"search\"])[3]"));
    public static final Target SPAN_SELECTOR = Target.the("object list selector")
            .located(By.xpath("//span[@class=\"ui-select-choices-row-inner\"]"));
    public static final Target NEXT_LAST_STEP = Target.the("Button to last step ")
            .located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));
    public static final Target LS_PSSWD_TEXTBOX = Target.the("Textbox to input password ")
            .located(By.id("password"));
    public static final Target LS_PSSWD_TEXTBOX_C = Target.the("Textbox to confirm input password")
            .located(By.id("confirmPassword"));
    public static final Target LS_CHECKBOX_TERMS = Target.the("Activate Terms  Checkbox ")
            .located(By.id("termOfUse"));
    public static final Target LS_CHECKBOX_PRIVACY = Target.the("Activate   Privacy Checkbox")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP = Target.the("Button to Finish SignUp")
            .located(By.id("laddaBtn"));
    public static final Target CONFIRM_SIGNUP = Target.the("Verify if the register is Complete")
            .located(By.xpath("//b[contains(text(),\"First, please check your email inbox\")]"));
}
