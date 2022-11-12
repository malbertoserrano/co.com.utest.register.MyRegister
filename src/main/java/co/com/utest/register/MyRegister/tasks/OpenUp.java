package co.com.utest.register.MyRegister.tasks;

import co.com.utest.register.MyRegister.userinterface.UtestPage;
import co.com.utest.register.MyRegister.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestPage utestpage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestpage),
                Click.on(UtestPage.JOIN_BUTTON));

    }
}
