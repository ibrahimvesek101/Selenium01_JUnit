package Day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_Faker {
   @Test
    public void fakerUsage(){

       Faker faker = new Faker();

       String isim=faker.name().nameWithMiddle();
       System.out.println(isim);

       String city = faker.address().city();
       System.out.println(city);

       String phoneNumber=faker.phoneNumber().phoneNumber();
       System.out.println(phoneNumber);

   }
}
