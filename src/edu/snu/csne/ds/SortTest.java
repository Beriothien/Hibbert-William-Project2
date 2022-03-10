/*
Project # 2
CSNE-2923-01

William Hibbert
 */

package edu.snu.csne.ds;
// Import statements

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest
{

    protected SelectionSorter selection = new SelectionSorter();
    protected InsertionSorter inserter = new InsertionSorter();
    protected MergeSorter merger = new MergeSorter();
    protected QuickSorter quick = new QuickSorter();

    @Test
    public void testSort()
    {
        // Test that the array returned is of the same length
        Integer[] emptyCheck = new Integer[0];
        assertEquals(0,selection.sort(emptyCheck).length);


        for(int i = 0; i<100; i++) {
            // Test sorting a list of ints that are backwards
            Integer[] backwardInt = {3, 2, 1};
            Integer[] expectedInt = {1, 2, 3};
            assertEquals(Arrays.toString(expectedInt), Arrays.toString(selection.sort(backwardInt)));

            // Test sorting a list of strings that are backwards
            String[] backwardString = {"c", "b", "a"};
            String[] expectedString = {"a", "b", "c"};
            assertEquals(Arrays.toString(expectedString), Arrays.toString(selection.sort(backwardString)));
        }
        // Test that the array returned is of the same length
        Integer[] oneLong = {9};
        assertEquals(1,selection.sort(oneLong).length);


        // Test Sorting an array of length 100 100 times
        for(int k=0;k<100;k++)
        {
            Integer[] testHundred = new Integer[100];
            int index = 99;
            int index2 = 0;
            while (index >= 0)
            {
                testHundred[index2]=index;
                index--;
                index2++;
            }

            Integer[] hundred = new Integer[100];
            for (int j = 0; j < 100; j++)
            {
                hundred[j] = j;
            }
            assertEquals(Arrays.toString(hundred), Arrays.toString(selection.sort(testHundred)));
      }

    }

}
class InsertionSortTest
{

    protected InsertionSorter inserter = new InsertionSorter();

    @Test
    public void testSort()
    {
        // Test that the array returned is of the same length
        Integer[] emptyCheck = new Integer[0];
        assertEquals(0,inserter.sort(emptyCheck).length);


        for(int i = 0; i<100; i++) {
            // Test sorting a list of ints that are backwards
            Integer[] backwardInt = {3, 2, 1};
            Integer[] expectedInt = {1, 2, 3};
            assertEquals(Arrays.toString(expectedInt), Arrays.toString(inserter.sort(backwardInt)));

            // Test sorting a list of strings that are backwards
            String[] backwardString = {"c", "b", "a"};
            String[] expectedString = {"a", "b", "c"};
            assertEquals(Arrays.toString(expectedString), Arrays.toString(inserter.sort(backwardString)));
        }
        // Test that the array returned is of the same length
        Integer[] oneLong = {9};
        assertEquals(1,inserter.sort(oneLong).length);


        // Test Sorting an array of length 100 100 times
        for(int k=0;k<100;k++)
        {
            Integer[] testHundred = new Integer[100];
            int index = 99;
            int index2 = 0;
            while (index >= 0)
            {
                testHundred[index2]=index;
                index--;
                index2++;
            }

            Integer[] hundred = new Integer[100];
            for (int j = 0; j < 100; j++)
            {
                hundred[j] = j;
            }
            assertEquals(Arrays.toString(hundred), Arrays.toString(inserter.sort(testHundred)));
        }

    }

}

class MergeSortTest
{

    protected MergeSorter merger = new MergeSorter();

    @Test
    public void testSort()
    {
        // Test that the array returned is of the same length
        Integer[] emptyCheck = new Integer[0];
        assertEquals(0,merger.sort(emptyCheck).length);


        for(int i = 0; i<100; i++) {
            // Test sorting a list of ints that are backwards
            Integer[] backwardInt = {3, 2, 1};
            Integer[] expectedInt = {1, 2, 3};
            assertEquals(Arrays.toString(expectedInt), Arrays.toString(merger.sort(backwardInt)));

            // Test sorting a list of strings that are backwards
            String[] backwardString = {"c", "b", "a"};
            String[] expectedString = {"a", "b", "c"};
            assertEquals(Arrays.toString(expectedString), Arrays.toString(merger.sort(backwardString)));
        }
        // Test that the array returned is of the same length
        Integer[] oneLong = {9};
        assertEquals(1,merger.sort(oneLong).length);


        // Test Sorting an array of length 100 100 times
        for(int k=0;k<100;k++)
        {
            Integer[] testHundred = new Integer[100];
            int index = 99;
            int index2 = 0;
            while (index >= 0)
            {
                testHundred[index2]=index;
                index--;
                index2++;
            }

            Integer[] hundred = new Integer[100];
            for (int j = 0; j < 100; j++)
            {
                hundred[j] = j;
            }
            assertEquals(Arrays.toString(hundred), Arrays.toString(merger.sort(testHundred)));
        }

    }

}
class QuickSortTest
{

    protected QuickSorter quick = new QuickSorter();

    @Test
    public void testSort()
    {
        // Test that the array returned is of the same length
        Integer[] emptyCheck = new Integer[0];
        assertEquals(0,quick.sort(emptyCheck).length);


        for(int i = 0; i<100; i++) {
            // Test sorting a list of ints that are backwards
            Integer[] backwardInt = {3, 2, 1};
            Integer[] expectedInt = {1, 2, 3};
            assertEquals(Arrays.toString(expectedInt), Arrays.toString(quick.sort(backwardInt)));

            // Test sorting a list of strings that are backwards
            String[] backwardString = {"c", "b", "a"};
            String[] expectedString = {"a", "b", "c"};
            assertEquals(Arrays.toString(expectedString), Arrays.toString(quick.sort(backwardString)));
        }
        // Test that the array returned is of the same length
        Integer[] oneLong = {9};
        assertEquals(1,quick.sort(oneLong).length);


        // Test Sorting an array of length 100 100 times
        for(int k=0;k<100;k++)
        {
            Integer[] testHundred = new Integer[100];
            int index = 99;
            int index2 = 0;
            while (index >= 0)
            {
                testHundred[index2]=index;
                index--;
                index2++;
            }

            Integer[] hundred = new Integer[100];
            for (int j = 0; j < 100; j++)
            {
                hundred[j] = j;
            }
            assertEquals(Arrays.toString(hundred), Arrays.toString(quick.sort(testHundred)));
        }

    }

}