/**
 * MergeSorter
 *
 * Sorts Array using merge sort algorithm
 *
 * @author William Hibbert
 */
package edu.snu.csne.ds;

public class MergeSorter implements Sorter{
    /**
     * Sorts the given array.
     *
     * @param unsorted The array to sort
     * @return The sorted array
     */
    @Override
    public Comparable[] sort(Comparable[] unsorted) {
        return mergeSort(unsorted, 0, unsorted.length-1);
    }

    /**
     *  Merges array back together
     * @param a array to merge
     * @param first start of first half
     * @param mid midpoint in the array
     * @param last last item in array
     * @param <T> generics for array
     */
    private static <T extends Comparable<? super T>> void merge(T[] a, int first, int mid, int last)
    {
        // Find sizes of two sub-arrays to be merged and Create two temp arrays of sub-arrays length
        int n1 = mid - first + 1;
        int n2 = last - mid;

        T[] L = (T[])new Comparable[n1];
        T[] R = (T[])new Comparable[n2];

        // Copy items to temporary arrays
        System.arraycopy(a, first + 0, L, 0, n1);
        // Didn't debug why arraycopy didn't work on R, didn't want to break what worked
        for (int j=0; j<n2; ++j)
        {
            R[j] = a[mid + 1 + j];
        }

        // Initial indexes of sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array
        int k = first;

        // Merge the two arrays
        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j]) <= 0)
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining items in L[]
        while (i < n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining items in R[]
        while (j < n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     *  Recursively sorts an array
     * @param a array to be sorted
     * @param first starting position to sort from
     * @param last last position to sort
     * @param <T> generics for array
     * @return returns array
     */
    private static <T extends Comparable<? super T>> T[] mergeSort(T a[], int first, int last)
    {
        if (first < last)
        {
            // Find the middle point
            int mid = (first+last)/2;

            // Sort first and second halves
            mergeSort(a, first, mid);
            mergeSort(a , mid+1, last);

            // Merge the sorted halves
            merge(a, first, mid, last);
        }
        return a;
    }
}
