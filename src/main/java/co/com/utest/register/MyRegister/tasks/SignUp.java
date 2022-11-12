package co.com.utest.register.MyRegister.tasks;

import co.com.utest.register.MyRegister.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUp implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strOS;
    private String strOsVersion;
    private String strOsLang;
    private String strMobile;
    private String strMobileVersion;
    private String strMobileOs;
    private String strPassword;

    public SignUp(String strFirstName, String strLastName, String strEmail, String strCity, String strZip, String strCountry, String strOS, String strOsVersion, String strOsLang, String strMobile, String strMobileVersion, String strMobileOs, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strOS = strOS;
        this.strOsVersion = strOsVersion;
        this.strOsLang = strOsLang;
        this.strMobile = strMobile;
        this.strMobileVersion = strMobileVersion;
        this.strMobileOs = strMobileOs;
        this.strPassword = strPassword;
    }

    public static SignUp PersonalData(String strFirstName, String strLastName, String strEmail, String strCity, String strZip, String strCountry, String strOS, String strOsVersion, String strOsLang, String strMobile, String strMobileVersion, String strMobileOs, String strPassword) {
        return Tasks.instrumented(SignUp.class,strFirstName,strLastName,strEmail, strCity, strZip, strCountry, strOS, strOsVersion, strOsLang, strMobile, strMobileVersion, strMobileOs, strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(UtestRegisterPage.FIRST_NAME_TXTBOX),
                Enter.theValue(strLastName).into(UtestRegisterPage.LAST_NAME_TXTBOX),
                Enter.theValue(strEmail).into(UtestRegisterPage.EMAIL_TXTBOX),
                Click.on(UtestRegisterPage.DB_MONTH),
                Click.on(UtestRegisterPage.DB_DAY),
                Click.on(UtestRegisterPage.DB_YEAR),
                Click.on(UtestRegisterPage.NEXT_LOCATION),
                Clear.field(UtestRegisterPage.LOCATION_CITY),
                Enter.theValue(strCity).into(UtestRegisterPage.LOCATION_CITY),
                Clear.field(UtestRegisterPage.LOCATION_ZIP),
                Enter.theValue(strZip).into(UtestRegisterPage.LOCATION_ZIP),
                Click.on(UtestRegisterPage.LOCATION_COUNTRY_SELECT),
                Enter.theValue(strCountry).into(UtestRegisterPage.LOCATION_COUNTRY_TEXTBOX),
                Click.on(UtestRegisterPage.NEXT_DEVICES),
                Click.on(UtestRegisterPage.DEVICE_COMPUTER),
                Enter.theValue(strOS).into(UtestRegisterPage.DEVICE_COMPUTER_TXTBOX),
                Click.on(UtestRegisterPage.DEVICE_VERSION),
                Enter.theValue(strOsVersion).into(UtestRegisterPage.DEVICE_VERSION_TXTBOX),
                Click.on(UtestRegisterPage.DEVICE_LANGUAGE),
                Enter.theValue(strOsLang).into(UtestRegisterPage.DEVICE_LANGUAGE_TXTBOX),
                Click.on(UtestRegisterPage.DEVICE_MOBILE),
                Enter.theValue(strMobile).into(UtestRegisterPage.DEVICE_MOBILE_TXTBOX),
                Click.on(UtestRegisterPage.SPAN_SELECTOR),
                Click.on(UtestRegisterPage.DEVICE_MODEL),
                Enter.theValue(strMobileVersion).into(UtestRegisterPage.DEVICE_MODEL_TXTBOX),
                Click.on(UtestRegisterPage.SPAN_SELECTOR),
                Click.on(UtestRegisterPage.DEVICE_MOBILE_OS),
                Enter.theValue(strMobileOs).into(UtestRegisterPage.DEVICE_MOBILE_OS_TXTBOX),
                Click.on(UtestRegisterPage.SPAN_SELECTOR),
                Click.on(UtestRegisterPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(UtestRegisterPage.LS_PSSWD_TEXTBOX),
                Enter.theValue(strPassword).into(UtestRegisterPage.LS_PSSWD_TEXTBOX_C),
                Click.on(UtestRegisterPage.LS_CHECKBOX_TERMS),
                Click.on(UtestRegisterPage.LS_CHECKBOX_PRIVACY),
                Click.on(UtestRegisterPage.COMPLETE_SETUP)




        );

    }
}
