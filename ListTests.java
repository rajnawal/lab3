import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

public class ListTests {
    // @Test
    // public void testFilter(){
    //     List<String> input = List.of("irony", "smile");
    //     StringChecker checker = new NewChecker();

    //     assertArrayEquals(input.toArray(), ListExamples.filter(input, checker).toArray());
    // }    

    @Test
    public void testMerge(){
        List<String> input1 = List.of("apple", "banana");
        List<String> input2 = List.of("aardvark", "chili", "dog");
        List<String> expected = List.of("aardvark", "apple", "banana", "chili", "dog");

        assertArrayEquals(expected.toArray(), ListExamples.merge(input1, input2).toArray());
    }
}
