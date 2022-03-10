/**
 * QuickSorter
 *
 * Sorts Array using quick sort algorithm
 *
 * @author William Hibbert
 */
package edu.snu.csne.ds;

public class QuickSorter extends InsertionSorter{
    /**
     * Sorts the given array.
     *
     * @param unsorted The array to sort
     * @return The sorted array
     */
    @Override
    public Comparable[] sort(Comparable[] unsorted) {
        return quickSort(unsorted, 0, unsorted.length-1);
    }


    public static <T extends Comparable<? super T>> T[] quickSort(T[] a, int first, int last)
    {
        if(last - first + 1 < 4 )
        {
            insertionSort(a, first, last);
        }
        else
        {
            int pivotIndex = partition(a, first, last);

            quickSort(a, first, pivotIndex -1);
            quickSort(a, pivotIndex + 1, last);
        }

        return a;
    }

    /**
     *  Finds
     * @param a array to be modified
     * @param first position to sort from
     * @param last last position in the array
     * @param <T> generics for array
     * @return return int of partition position
     */
    static <T extends Comparable<? super T>> int partition(T[] a, int first, int last)
    {
        // Set the pivot point to the last space
        T pivot = a[last];

        int i = first-1;
        // Iterate through the array, if it is less than the pivot then swap
        for(int j = first; j <= last -1; j++)
        {
            if(a[j].compareTo(pivot)<0)
            {
                i++;
                swap(a, i, j);
            }
        }
        // Swap pivot +1 to last
        swap( a, i + 1, last);
        return (i + 1);
    }

    /**
     *  Swaps items positions in array
     * @param a array to modify
     * @param i position of first item
     * @param j position of second item
     * @param <T> generics for array
     */
    static <T extends Comparable<? super T>> void swap(T[] a, int i, int j)
    {
        // Swaps items positions
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
