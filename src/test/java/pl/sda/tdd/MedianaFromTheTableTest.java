package pl.sda.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianaFromTheTableTest {

    private int[] tabEmpty; //można to poprzenosić do metod
    private int[] tabNull;
    private int[] tabNotEven = {1, 2, 3};

    @Test
    public void showMedianEmptyTest() {
        tabEmpty = new int[5];
        int resultFromMethod = MedianaFromTheTable.showMedian(tabEmpty);
        assertEquals(0, resultFromMethod);
    }

    @Test
    public void showMedianNullTest() {
       // int resultFromMethod = MedianaFromTheTable.showMedian(tabNull);
       assertNull(MedianaFromTheTable.showMedian(null));
    }

    @Test
    public void showMedianEvenTest() {
        int[] tabEven = {1, 2, 3, 4};
        int resultFromMethod = MedianaFromTheTable.showMedian(tabEven);
        assertEquals(2, resultFromMethod);
    }

    @Test
    public void showMedianNotEvenTest() {
        int resultFromMethod = MedianaFromTheTable.showMedian(tabNotEven);
        assertEquals(2, resultFromMethod);
    }

}
/*
Kod z zajęć
@Test
public void returnNullWhenArrayEmpty() {
init[] emptyArray = new int[0];
assertNull(MedianaFromTheTable.showMedian(emptyArray));
 */