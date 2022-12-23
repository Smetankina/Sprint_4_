package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePageClass {

    private WebDriver driver;

    //конструктор для класса страницы
    public HomePageClass(WebDriver driver) {
        this.driver = driver;
    }


    public HomePageClass openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        return this;
    }

    //кнопка Заказать в Header
    private By orderButtonInHeader = By.xpath(".//button[(@class ='Button_Button__ra12g' and text()='Заказать')]");
    //кнопка Заказать в ThirdPart
    private By orderButtonInEnd = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    //0 Кликнуть на "Сколько это стоит?И как оплатить?" By.id="accordion__heading-0"
    private By List0 = By.id("accordion__heading-0");
    //Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private By textList0 = By.xpath(".//*[@id='accordion__panel-0']/p");
    //1 Хочу сразу несколько самокатов! Так можно?
    private By List1 = By.id("accordion__heading-1");
    //Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    private By textList1 = By.xpath(".//*[@id='accordion__panel-1']/p");
    //2 Как рассчитывается время аренды?
    private By List2 = By.id("accordion__heading-2");
    //Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    private By textList2 = By.xpath(".//*[@id='accordion__panel-2']/p");
    //3 Можно ли заказать самокат прямо на сегодня?
    private By List3 = By.id("accordion__heading-3");
    //Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    private By textList3 = By.xpath(".//*[@id='accordion__panel-3']/p");
    //4 Можно ли продлить заказ или вернуть самокат раньше?
    private By List4 = By.id("accordion__heading-4");
    //Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    private By textList4 = By.xpath(".//*[@id='accordion__panel-4']/p");
    //5 Вы привозите зарядку вместе с самокатом?
    private By List5 = By.id("accordion__heading-5");
    //Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    private By textList5 = By.xpath(".//*[@id='accordion__panel-5']/p");
    //6 Можно ли отменить заказ?
    private By List6 = By.id("accordion__heading-6");
    // Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.''
    private By textList6 = By.xpath(".//*[@id='accordion__panel-6']/p");
    //7 Я жизу за МКАДом, привезёте?
    private By List7 = By.id("accordion__heading-7");
    // Да, обязательно. Всем самокатов! И Москве, и Московской области.
    private By textList7 = By.xpath(".//*[@id='accordion__panel-7']/p");




    //метод для клика по кнопке Заказать в Хедере
    public HomePageClass clickOrderButtonInHeader() {
        driver.findElement(orderButtonInHeader).click();
        return this;
    }

    public HomePageClass orderButtonInEnd() {
        driver.findElement(orderButtonInEnd).click();
        return this;
    }


    // методы для клика по элементам в списке
    public HomePageClass clickList0() {
        //new WebDriverWait(driver, 10)
      //          .until(ExpectedConditions.elementToBeClickable(textList0));

        driver.findElement(List0).click();

        return this;

    }





    public HomePageClass clickList1() {

        driver.findElement(List1).click();

        return this;
    }

    public HomePageClass clickList2() {

        driver.findElement(List2).click();
        return this;
    }

    public HomePageClass clickList3() {

        driver.findElement(List3).click();
        return this;
    }

    public HomePageClass clickList4() {

        driver.findElement(List4).click();
        return this;
    }

    public HomePageClass clickList5() {

        driver.findElement(List5).click();
        return this;
    }

    public HomePageClass clickList6() {

        driver.findElement(List6).click();
        return this;
    }

    public HomePageClass clickList7() {

        driver.findElement(List7).click();
        return this;
    }

    // метод для получения текста элемента в списке
    public String getTextList0() {

      return   driver.findElement(textList0).getText();

    }

    public String getTextList1() {

        return driver.findElement(textList1).getText();
    }

    public String getTextList2() {

        return driver.findElement(textList2).getText();
    }

    public String getTextList3() {

        return driver.findElement(textList3).getText();
    }

    public String getTextList4() {

        return driver.findElement(textList4).getText();
    }

    public String getTextList5() {

        return driver.findElement(textList5).getText();
    }

    public String getTextList6() {

        return driver.findElement(textList6).getText();
    }

    public String getTextList7() {

        return driver.findElement(textList7).getText();
    }
    //метод для прокрутки страницы до элемента

    public HomePageClass scrollPage() {
        WebElement element = driver.findElement(List0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }
}

