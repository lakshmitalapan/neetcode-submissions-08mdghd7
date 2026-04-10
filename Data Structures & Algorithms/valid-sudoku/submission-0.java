class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, ArrayList<Character>> rows = new HashMap<>();
        HashMap<Integer, ArrayList<Character>> columns = new HashMap<>();
        HashMap<Integer, ArrayList<Character>> squares = new HashMap<>();

        //go through rows

        for (int i = 0; i < 9; i++) {
            rows.put(i, new ArrayList<>());
            columns.put(i, new ArrayList<>());
            squares.put(i, new ArrayList<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int box = (i / 3) * 3 + (j / 3);
                if (board[i][j] == '.') { continue; }
                if (rows.get(i).contains(board[i][j])) {
                    return false;
                }
                rows.get(i).add(board[i][j]);
                if (columns.get(j).contains(board[i][j])) {
                    return false;
                }
                columns.get(j).add(board[i][j]);
                if (squares.get(box).contains(board[i][j])) {
                    return false;
                }
                squares.get(box).add(board[i][j]);
            }
        }
        return true;
    }
}
