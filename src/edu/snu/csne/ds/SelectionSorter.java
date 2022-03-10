/**
 * SelectionSorter
 *
 * Sorts Array using selection sort algorithm
 *
 * @author William Hibbert
 */

// package
package edu.snu.csne.ds;


public class SelectionSorter implements Sorter
{
    /**
     * Sorts the given array.
     *
     * @param unsorted The array to sort
     * @return The sorted array
     */
    @Override
    public Comparable[] sort(Comparable[] unsorted)
    {
        // Iterate through the array and swaps the current smallest to current index
        for( int i = 0; i < unsorted.length - 1; i++)
        {
            int indexOfNextSmallest = getIndexOfSmallest( unsorted, i, unsorted.length-1);
            swap( unsorted, i, indexOfNextSmallest);

        }
        // Return the array
        return unsorted;
    }

    /**
     *  gets the index of the smallest item in the given array
     * @param a array to check
     * @param first first value to check in the array
     * @param last last value in the array
     * @param <T> generics for the array
     * @return returns an int of the items index
     */
    private static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] a, int first, int last)
    {
        T min = a[first];
        int indexOfMin = first;
        // Iterate through the array and find the index of the smallest value
        for (int i = first + 1; i <= last; i++)
        {
            if(a[i].compareTo(min)<0)
            {
                min = a[i];
                indexOfMin = i;
            }
        }

        return indexOfMin;
    }

    /**
     *  swap an items position in the array
     * @param a array to swap
     * @param i item 1 to swap
     * @param j item 2 to swap
     */
    private static void swap(Object[] a, int i, int j)
    {
        // Swaps items in positions a[i] and a[j]
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
