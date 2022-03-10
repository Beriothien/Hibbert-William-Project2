/**
 * InsertionSorter
 *
 * Sorts Array using insertion sort algorithm
 *
 * @author William Hibbert
 */

// package
package edu.snu.csne.ds;

public class InsertionSorter implements Sorter{
    /**
     * Sorts the given array.
     *
     * @param unsorted The array to sort
     * @return The sorted array
     */
    @Override
    public Comparable[] sort(Comparable[] unsorted) {
        // Calls recursive function insertionSort
        return insertionSort(unsorted,0, unsorted.length-1);
    }

    /**
     *  Recursively sorts the array
     * @param a array to be sorted
     * @param first starting position to sort from
     * @param last last position in the array
     * @param <T> generics for the array
     * @return returns the array
     */
    public static <T extends Comparable<? super T>> T[] insertionSort(T[] a, int first, int last)
    {

        if( first < last)
        {
            // Call this function and go sort through the array with recursion
            insertionSort(a, first, last -1);
            // Insert the last item
            insertInOrder(a[last], a, first, last-1);
        }
        // Return the array
        return a;
    }

    /**
     *  Inserts an item into a sorted array
     * @param anEntry item to insert into array
     * @param a array to be modified
     * @param begin item at the start of the array
     * @param end item 1 before the end of the array
     * @param <T> generics for array
     */
    private static <T extends Comparable<? super T>> void insertInOrder(T anEntry,T[] a, int begin, int end)
    {
        // If the item is >= to the last item make the space after the last be the item
        if( anEntry.compareTo(a[end]) >= 0)
        {
            a[end+1] = anEntry;
        }
        // if the beginning is less than the end shift end down one and recall this function
        else if (begin < end)
        {
            a[end + 1] = a[end];
            insertInOrder(anEntry, a, begin, end-1);
        }
        // If the beginning is less than the end insert before the end
        else
        {
            a[end + 1] = a[end];
            a[end] = anEntry;
        }
    }












}
