# Similar tables

Similar tables are tables that have the same variety of values.

Given tables A[1:10] and B[1:15]. The task is to check if they are similar.

The algorithm is of O(n) complexity. Using the HashMap class we initially mark all values from the first table as 1, then going through the second table we check if all of the values of table B are already present in HashMap and meanwhile mark checked as 2. In the end, we check if there is no marks with value of 1. If any of the conditions is not satisfied, tables are not similar.
