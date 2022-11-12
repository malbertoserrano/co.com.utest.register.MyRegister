package co.com.utest.register.MyRegister.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button that show the first step to Register")
            .located(By.xpath("//a[@class=\"unauthenticated-nav-bar__sign-up\" or @ui-sref=\"signup.personal\"]"));


}
