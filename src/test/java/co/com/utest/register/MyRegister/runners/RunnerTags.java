package co.com.utest.register.MyRegister.runners;

import cucumber.api.CucumberOptions;
import static cucumber.api.SnippetType.CAMELCASE;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/Utest.feature",
        tags = "@stories",
        glue = "co.com.utest.register.MyRegister.stepdefinitions",
        snippets = CAMELCASE)


public class RunnerTags {

}