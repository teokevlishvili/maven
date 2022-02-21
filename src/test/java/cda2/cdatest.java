package cda2;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class cdatest {

    @Test

    public void test (){
        open("https://www.google.com/");
        sleep(3000);
        $(".gLFyf").setValue("teona").pressEnter();
        sleep(3000);

    }

}
