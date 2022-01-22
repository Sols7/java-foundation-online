package ru.itsjava.annotations.junit;

public class MyFavoriteTest {

    @BeforeAll
    public void beforeAllMethod(){
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    public void AfterAllMethod(){
        System.out.println("AFTER ALL");
    }

    @Before
    public void beforeMethod(){}

    @DisplayName("Мой тест 1")
    @Test
    public void test1(){}

    @Test
    public void test2(){}

    @DisplayName("Мой тест 3")
    @Test
    public void test3(){
        throw new RuntimeException();
    }

    @Test
    public void test4(){
        throw new RuntimeException();
    }

    public void noTestMethod(){}

}
