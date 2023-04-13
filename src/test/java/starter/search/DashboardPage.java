package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("#th_reviewId_1001");
    public static final Target RK1001 =  Target.the("article identifier").locatedBy("//div[contains(text(),'1001')]");
    public static final Target ReviewKey =  Target.the("article identifier").locatedBy("//div[contains(text(),'1001')]");
    public static final Target Y2023 =  Target.the("article identifier").locatedBy("//option[contains(text(),'2023')]");
}
