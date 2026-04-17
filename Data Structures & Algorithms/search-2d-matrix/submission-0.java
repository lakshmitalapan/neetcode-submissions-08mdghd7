class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix.length * matrix[0].length;
        int left = 0;
        int right = size - 1;
        int middle;
        int currrow;
        int currcol;
        while (left <= right) {
            middle = (left + right) / 2;
            currrow = middle / matrix[0].length;
            currcol = middle % matrix[0].length;
            if (matrix[currrow][currcol] == target) {
                return true;
            } else if (matrix[currrow][currcol] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}
