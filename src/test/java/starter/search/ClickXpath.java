package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class ClickXpath {
    public static Performable withXpath(String elementXpath) {
        return Task.where("{0} clicks on the element with XPath '" + elementXpath + "'",
                Click.on(By.xpath(elementXpath))
        );
    }
}

