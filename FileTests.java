import static org.junit.Assert.*;

import java.io.File;
import java.util.List;
import org.junit.*;

public class FileTests{

    @Test
    public void testGetFiles(){
        try {
            System.out.println(FileExample.getFiles(new File("some-files")));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error!");
        }
    }
}