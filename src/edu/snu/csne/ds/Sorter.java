/**
 * Sorter
 *
 * Interface for sorting algorithms
 *
 * @author William Hibbert
 */
package edu.snu.csne.ds;

public interface Sorter<T extends Comparable<? super T>>
{
    /**
     * Sorts the given array.
     *
     * @param unsorted The array to sort
     * @return The sorted array
     */
    public T[] sort( T[] unsorted );

}