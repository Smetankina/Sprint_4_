package scootertests.FireFox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practikum.HomePageClass;
import ru.yandex.practikum.OrderPageClass;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderPageTestParameterized extends TestBaseFirefox {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String date;
    private final String comment;
    private final boolean isDisplayed;

    public OrderPageTestParameterized(String name, String surname, String address, String phone, String date, String comment, boolean isDisplayed) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.comment = comment;
        this.isDisplayed = isDisplayed;
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] doOrder() {
        return new Object[][] {
                { "Иван", "Иванов","Зеленая, 15","12345678912" ,"12.12.2020","корректный ввод",true},
                { "Петр", "Петров","Зеленая, 15","12345678912" ,"12.12.2025","корректный ввод",true},
                { "Петр", "Петров","notvalid","12345678912" ,"12.12.2025","некорректный ввод",false},
        };
    }

    @Test

    public void test() {

        new HomePageClass(driver)
                .openPage()
                .clickOrderButtonInHeader();
        new OrderPageClass(driver)

                .setNameField(name)
                .setSurnameField(surname)
                .setAddressField(address)
                .clickMetroField()
                .setPhoneField(phone)
                .clickOrderNextButton()
                .setDateField(date)
                .clickRentPeriod()
                .clickCheckBoxBlackColour()
                .setCommentField(comment)
                .clickOrderButton()
                .clickYesButton()
                .isOrderIsDoneDisplayed();

        OrderPageClass orderPageClass =new OrderPageClass(driver);
        boolean   isDisplayed = orderPageClass.isOrderIsDoneDisplayed();
        assertTrue("Окно Заказ Оформлен не отображено",isDisplayed);


    }


}
