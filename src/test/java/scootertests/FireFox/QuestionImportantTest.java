package scootertests.FireFox;

import org.junit.Test;

import ru.yandex.practikum.HomePageClass;

import static org.junit.Assert.assertEquals;

public class QuestionImportantTest extends TestBaseFirefox {



    private final String textExpected0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String textExpected1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String textExpected2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String textExpected3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String textExpected4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String textExpected5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String textExpected6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String textExpected7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";





    @Test

    public void test0() {

        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList0();

        HomePageClass objHomePageClass = new HomePageClass(driver);

        String textActual0 = objHomePageClass.getTextList0();

        assertEquals("Текст не соответствует ОР", textExpected0, textActual0);

    }

    @Test

    public void test1() {

        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList1();

        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual1 = objHomePageClass.getTextList1();

        assertEquals("Текст не соответствует ОР", textExpected1, textActual1);

    }

    @Test
    public void test2() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList2();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual2 = objHomePageClass.getTextList2();
        assertEquals("Текст не соответствует ОР", textExpected2, textActual2);

    }




    @Test
    public void test3() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList3();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual3 = objHomePageClass.getTextList3();
        assertEquals("Текст не соответствует ОР", textExpected3, textActual3);

    }

    @Test
    public void test4() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList4();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual4 = objHomePageClass.getTextList4();
        assertEquals("Текст не соответствует ОР", textExpected4, textActual4);

    }

    @Test
    public void test5() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList5();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual5 = objHomePageClass.getTextList5();
        assertEquals("Текст не соответствует ОР", textExpected5, textActual5);

    }

    @Test
    public void test6() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList6();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual6 = objHomePageClass.getTextList6();
        assertEquals("Текст не соответствует ОР", textExpected6, textActual6);

    }

    @Test
    public void test7() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickList7();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String textActual7 = objHomePageClass.getTextList7();
        assertEquals("Текст не соответствует ОР", textExpected7, textActual7);

    }

}
