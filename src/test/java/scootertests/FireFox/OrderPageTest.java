package scootertests.FireFox;

import org.junit.Test;
import ru.yandex.practikum.HomePageClass;
import ru.yandex.practikum.OrderPageClass;

import static org.junit.Assert.assertTrue;

public class OrderPageTest extends TestBaseFirefox {


    @Test

    public void test() {

        new HomePageClass(driver)
                .openPage()
                .clickOrderButtonInHeader();
        new OrderPageClass(driver)

                .setNameField("Иван")
                .setSurnameField("Иванов")
                .setAddressField("Жуковского, 5")
                .clickMetroField()
                .setPhoneField("94512345578")
                .clickOrderNextButton()
                .setDateField("20.01.2023")
                .clickRentPeriod()
                .clickCheckBoxBlackColour()
                .setCommentField("Спасибо за ревью!")
                .clickOrderButton()
                .clickYesButton()
                .isOrderIsDoneDisplayed();

        OrderPageClass orderPageClass =new OrderPageClass(driver);
        boolean   isDisplayed = orderPageClass.isOrderIsDoneDisplayed();
        assertTrue("Окно Заказ Оформлен не отображено",isDisplayed);
    }

}
