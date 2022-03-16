# Discussion

## PART I: MEASURED IndexedList

1. **Discuss from a design perspective whether or not iterating over a `MeasuredIndexedList` should affect the accesses and mutation counts. Note that for the purposes of this assignment we are NOT asking you to rewrite the `ArrayIndexedListIterator` to do so. However, if you wanted to include the `next()` and/or `hasNext()` methods in the statistics measured, can you inherit `ArrayIndexedListIterator` from `ArrayIndexedList` and override the relevant methods, or not? Explain.**

- Yes, the iterator should increment the accesses and mutations. THis is because methods like count increment it, so therefore it is not only incremented on direct access, but on all accesses.
- No, we cannot inherit the `ArrayIndexedListIterator` from `ArrayIndexedList`because it is a private class.

## PART II: ALL SORT OF SORTS

1. **Explain the mistake in the setup/implementation of the experiment is set up and implemented which resulted in a discrepancy between the results and what is expected from each sorting algorithm.**
- The mistake is that the data was taken as a string and not as an int, so therefore the comparison was wrong. I found this by looking at the algorithms and running some test cases.


2. **Does the actual running time correspond to the asymptotic complexity as you would expect?**
- Yes, the running time is O(n^2) because it is a nested loop. I set sizes of 10, 100, 1000, and it is going up asymptotically, not linearly. 


3. **What explains the practical differences between these algorithms? (Theoretically, the algorithm runs in O(X) time, where X is a function of the input size, but in practice (i.e running it on datasets), you may observe that it is slower/faster compared to the other algorithms)**
- They all have different constant factors, therefore there are slight differences in the running time, even though it is asymptotically the same.


4. **Does it matter what kind of data (random, already sorted in ascending order, sorted in descending order) you are sorting? How should each algorithm behave (in terms of performance) based on the type of data it receives?**
- The type of data matters. For selection sort the time complexity is always O(n^2) but for the others it is O(n) best case and O(n^2) worst case.



## PART III: ANALYSIS OF SELECTION SORT

1. Determine exactly how many comparisons C(n) and assignments A(n) are performed by this implementation of selection sort in the worst case. Both of those should be polynomials of degree 2 since you know that the asymptotic complexity of selection sort is O(n^2).
- There are two comparisons per iteration. This is n + (n+1) + (n-2) + ... + 1 = n(n+1)/2. Therefore there are n(n+1)/2 comparisons.
- The assignments are 3/4(n^2). Line 3 gives us n+1, line 5 gives us n+(n-1)+(n+2) + ... + 1 = n(n+1)/2. Line 7 there are different cases for even and odd.
