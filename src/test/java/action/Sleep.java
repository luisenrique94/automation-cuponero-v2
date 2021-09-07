package action;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Sleep implements Task {
    public final int timeSeconds;

    public Sleep(int timeSeconds) throws InterruptedException {
        this.timeSeconds = timeSeconds;
        Thread.sleep(timeSeconds*1000);
    }

    public static Performable By(int timeSeconds) throws InterruptedException {
        return new Sleep(timeSeconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
