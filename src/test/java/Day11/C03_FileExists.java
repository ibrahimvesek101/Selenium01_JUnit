package Day11;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03_FileExists {

    @Test
    public void fileExists(){


        // System.getProperty("user.dir") -> proje yolunu verir

        // System.getProperty("user.dir") + "/fileExists.txt"

        String path =System.getProperty("user.dir")+"/fileExists.txt";
        System.out.println("path= "+path);

        Assert.assertTrue(Files.exists(Paths.get(path)));

    }
}
