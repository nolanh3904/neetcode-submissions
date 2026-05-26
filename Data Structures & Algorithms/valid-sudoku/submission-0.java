class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map = new HashMap<>();
        //rows
        for (int j = 0; j < 9; j++) {
        for (int i = 0; i < 9; i++) {
            if (board[j][i] == '.') {
                continue;
            }
            if (map.containsKey(board[j][i])){
                return false;
            }
            map.put(board[j][i], 0);
        }
        map.clear();
        }
        //coloumns
        for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[j][i] == '.') {
                continue;
            }
            if (map.containsKey(board[j][i])){
                return false;
            }
            map.put(board[j][i], 0);
        }
        map.clear();
        }
        //sub-boxes
        for (int startRow = 0; startRow < 9; startRow += 3) {
        for (int startCol = 0; startCol < 9; startCol += 3) {
             map.clear();

            for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
            if (board[r][c] == '.') {
                continue;
            }
            if (map.containsKey(board[r][c])){
                return false;
            }
            map.put(board[r][c], 0);
            }
            }
        }
        }
        return true;
    }
}
