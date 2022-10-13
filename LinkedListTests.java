import static org.junit.Assert.*;
import java.util.List;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend(){
        LinkedList testList = new LinkedList();
        testList.append(5);
        testList.append(2);
        testList.append(1);

        assertEquals("5 2 1 ", testList.toString());
    }
}
