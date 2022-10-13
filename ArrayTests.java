import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 1,2,3 };
    assertArrayEquals(new int[]{ 3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input = { 1.0,1.0};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }
}
