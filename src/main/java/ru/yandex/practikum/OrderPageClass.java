package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPageClass {

    WebDriver driver;
    //поле ввода Имя
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //поле ввода Фамилия
    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //поле ввода адреса
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле выпадающий список Станция метро
    private By metroField = By.xpath(".//input[@placeholder='* Станция метро']");
    //поле ввода Номер телефона
    private By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка Далее
    private By OrderNextButton = By.xpath(".//button[(@class ='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее')]");
    //Когда привезти Самокат
    private By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Срок аренды
    private By rentPeriodField = By.className("Dropdown-placeholder");
    //Цвет самоката черный чек-бокс
    private By checkBoxBlackColour = By.xpath(".//input[@id='black']");
    //Цвет самоката серый чек-бокс
    private By checkBoxGreyColour = By.xpath(".//input[@id='grey']");
    //Комментарий ля курьера
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка Заказать
    private By orderButton = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать')]");
    // Кнопка Да Окно Заказ Оформлен
    private By yesButton = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да')]");

    private By orderIsDone = By.className("Order_ModalHeader__3FDaJ");

    //конструктор класса
    public OrderPageClass(WebDriver driver) {
        this.driver = driver;
    }


    public OrderPageClass waitPageLoad() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfAllElements());
        return this;
    }

    //Ввод в поле Имя
    public OrderPageClass setNameField(String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    //Ввод в поле Фамилия
    public OrderPageClass setSurnameField(String surname) {

        driver.findElement(surnameField).sendKeys(surname);
        return this;
    }

    //Ввод в поле адреса
    public OrderPageClass setAddressField(String address) {

        driver.findElement(addressField).sendKeys(address);
        return this;
    }

    //выбрать Станцию метро
    public OrderPageClass clickMetroField() {
        driver.findElement(metroField).click();
        driver.findElement(By.xpath(".//button[@value='2']")).click();
        return this;
    }

    ;


    //Ввод в поле Номер телефона
    public OrderPageClass setPhoneField(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    //клик кнопка Далее
    public OrderPageClass clickOrderNextButton() {
        driver.findElement(OrderNextButton).click();
        return this;
    }

    //Когда привезти Самокат
    public OrderPageClass setDateField(String date) {
        driver.findElement(dateField).sendKeys(date);
        driver.findElement(dateField).sendKeys(Keys.ENTER);
        return this;
    }

    //Срок аренды
    public OrderPageClass clickRentPeriod() {
        driver.findElement(rentPeriodField).click();
        driver.findElement(By.xpath(".//*[(@role ='option' and text()='сутки')]")).click();
        return this;
    }

    //Выбрать Цвет самоката черный чек-бокс
    public OrderPageClass clickCheckBoxBlackColour() {
        driver.findElement(checkBoxBlackColour).click();
        return this;
    }

    //Цвет самоката серый чек-бокс
    public OrderPageClass clickCheckBoxGreyColour() {
        driver.findElement(checkBoxGreyColour).click();
        return this;
    }

    //Комментарий ля курьера
    public OrderPageClass setCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
        return this;
    }

    //Клик по Кнопке Заказать
    public OrderPageClass clickOrderButton() {
        driver.findElement(orderButton).click();
        return this;
    }

    //Клик по Кнопке Да
    public OrderPageClass clickYesButton() {
        driver.findElement(yesButton).click();
        return this;
    }

    //Окно Заказ Оформлен
    public boolean isOrderIsDoneDisplayed() {
        return driver.findElement(orderIsDone).isDisplayed();
         }


}
