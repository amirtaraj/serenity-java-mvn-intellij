package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class ClickElement {
    public static Performable withId(String elementId) {
        return Task.where("{0} clicks on the element with ID '" + elementId + "'",
                Click.on(By.id(elementId))
        );
    }
}

