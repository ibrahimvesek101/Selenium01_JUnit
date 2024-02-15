package Day11;

import org.junit.Test;

public class C02_Files {

    @Test
    public void files() {

        // Dosya ayiraci: Windows icin '\' - mac icin '/'
        String filesSeparator=System.getProperty("file.separator");
        System.out.println("filesaparator= "+filesSeparator);

        // Calisma ortami (Projenin content rootu)
        String root=System.getProperty("user.dir");
        System.out.println("root = " + root);

        // Home path
        String home=System.getProperty("user.home");
        System.out.println("home = " + home);


    }
}
