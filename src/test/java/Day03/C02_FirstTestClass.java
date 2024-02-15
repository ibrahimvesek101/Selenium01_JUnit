package Day03;

import org.junit.*;

public class C02_FirstTestClass {

    @Before
    public void beforeTestMethod(){
        System.out.println("\tBrowser acma konfigurasyon islemleri yapildi");
    }

    @Test
    public void test02(){
        System.out.println("\t\tTest 2 executed....");

    }

    @Test
    public void test01(){
        System.out.println("\t\tTest 1  executed....");

    }

    @Ignore
    @Test
    public void test03(){
        System.out.println("\t\tTest 3 executed....");

    }

    @After
    public void afterTestMethod(){
        System.out.println("\tBrowser imiz kapatildi.....");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Before class calisti");
    }

    @AfterClass
    public static void afterClassMethod(){
        System.out.println("After class calisti");
    }

}
