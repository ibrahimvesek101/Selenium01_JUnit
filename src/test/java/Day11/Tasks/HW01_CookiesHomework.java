package Day11.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HW01_CookiesHomework extends Base {

    /*
    Go to URL: http://facebook.com
    getCookies,
    addCookie,
    deleteCookieNamed,
    deleteAllCookies.
     */


    @Test
    public void getCookiesTest() {

        driver.get("http://facebook.com");
        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> i = cookies.iterator();

        // Print all cookies

        while (i.hasNext()) {
            Cookie currentCookie = i.next();
            String name = currentCookie.getName();
            String value = currentCookie.getValue();

            System.out.println("Name = " + name + ", Value = " + value);
        }
        System.out.println("\n");
    }


    @Test
    public void addCookieTest() {
        driver.get("http://facebook.com");

        Set<Cookie> cookies = driver.manage().getCookies();

        cookies.add(new Cookie("tatlı","baklava"));

        Iterator<Cookie> i = cookies.iterator();

        // Print all cookies

        while (i.hasNext()) {
            Cookie currentCookie = i.next();

            String name = currentCookie.getName();
            String value = currentCookie.getValue();

            System.out.println("Name = " + name + ", Value = " + value);
        }
        System.out.println("\n");
    }


    @Test
    public void deleteCookieNamedTest() {

        driver.get("http://facebook.com");
        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> i = cookies.iterator();

        System.out.println("cookies.size() = " + cookies.size());
        driver.manage().deleteCookieNamed("wd");
        System.out.println("cookies.size() = " + cookies.size());

        // Print all cookies

        while (i.hasNext()) {

            Cookie currentCookie = i.next();

            String name = currentCookie.getName();

            String value = currentCookie.getValue();

            System.out.println("Name = " + name + ", Value = " + value);

        }
        System.out.println("\n");
    }
    @Test

    public void deleteAllCookiesTest(){
        driver.get("http://facebook.com");
        Set<Cookie> cookies = driver.manage().getCookies();

        driver.manage().deleteAllCookies();

        System.out.println(cookies);
    }
}