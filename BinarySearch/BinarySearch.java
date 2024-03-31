class BinarySearch {
    /**
     * Given an array of integers, this method returns the index at which that value resides at
     * @param arr The given array of integers
     * @param val The value to search for
     * @return The resulting index (or -1 if not found)
     */
    public static int binarySearch(int[] arr, int val, int start, int end) {
        if (arr.length == 0) {
            return -1;
        } 
        else if (arr.length == 1) return arr[0] == val ? 0 : -1;
        else if (start == end) return -1;
        else {
            int index = start + ((end+1) - start)/2;
            if (arr[index] == val) return index;
            else if (arr[index] > val) return binarySearch(arr, val, start, index-1);
            else return binarySearch(arr, val, index+1, end);
        }
    }
}
