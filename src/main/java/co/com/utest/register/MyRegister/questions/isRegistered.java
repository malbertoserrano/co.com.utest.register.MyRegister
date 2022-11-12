package co.com.utest.register.MyRegister.questions;

import co.com.utest.register.MyRegister.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



public class isRegistered implements Question<Boolean> {
    private String completeSignUp;

    public isRegistered(String completeSignUp) {
        this.completeSignUp = completeSignUp;
    }


    public static isRegistered finished(String completeSignUp) {
        return new isRegistered(completeSignUp);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirm_signup = Text.of(UtestRegisterPage.CONFIRM_SIGNUP).viewedBy(actor).asString();
        if (completeSignUp.equals(confirm_signup))
        {
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
