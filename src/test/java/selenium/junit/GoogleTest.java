package selenium.junit;

import org.junit.Test;
import test.tools.selenium.junit.SeleniumBaseTR;

public class GoogleTest extends SeleniumBaseTR {

    @Test
    public void googlePageTest() throws Exception {
        String testCaseName = "customerLogin";
        setUp(testCaseName);
        enterHomePage();
        pageLoaded("GOOGLE.COM SAYFASI");
        fillInputField("ARA", "Fenerbahçe");
        clickObject("GOOGLE'DA ARA BUTONU");
        pageLoaded("SPOR SONUCLARI SAYFASI");
        teardown(testCaseName);
    }

    @Test
    public void googlePageTest2() throws Exception {
        String testCaseName = "customerLogin";
        setUp(testCaseName);
        enterHomePage();
        pageLoaded("GOOGLE.COM SAYFASI");
        fillInputField("ARA", "Fenerbahçe");
        clickObject("GOOGLE'DA ARA BUTONU");
        pageLoaded("SPOR SONUCLARI SAYFASI");
        teardown(testCaseName);
    }

}
