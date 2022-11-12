package co.com.utest.register.MyRegister.stepdefinitions;

import co.com.utest.register.MyRegister.model.UtestUserData;
import co.com.utest.register.MyRegister.questions.isRegistered;
import co.com.utest.register.MyRegister.tasks.OpenUp;
import co.com.utest.register.MyRegister.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^that Diana wants to register as a tester in Utest$")
    public void thatDianaWantsToRegisterAsATesterInUtest()
            throws Exception{
        OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.thePage());

    }

    @When("^she enters the required data for register$")
    public void sheEntersTheRequiredDataForRegister(List<UtestUserData> ustestuserdata)
                throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.
                PersonalData(ustestuserdata.get(0).getStrFirstName(),ustestuserdata.get(0).getStrLastName(),
                        ustestuserdata.get(0).getStrEmail(),ustestuserdata.get(0).getStrCity(),
                        ustestuserdata.get(0).getStrZip(),ustestuserdata.get(0).getStrCountry(),
                        ustestuserdata.get(0).getStrOS(),ustestuserdata.get(0).getStrOsVersion(),
                        ustestuserdata.get(0).getStrOsLang(), ustestuserdata.get(0).getStrMobile(),
                        ustestuserdata.get(0).getStrMobileVersion(),ustestuserdata.get(0).getStrMobileOs(),
                        ustestuserdata.get(0).getStrPassword())
        );
    }

    @Then("^she finally is registered in Utest platform when sees in page$")
    public void sheFinallyIsRegisteredInUtestPlatformWhenSeesInPage(List<UtestUserData> ustestuserdata)
            throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(isRegistered.finished(ustestuserdata.get(0).getStrSuccessSignUp())));
    }


}
