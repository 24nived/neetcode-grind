class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;

                char num = board[i][j];

                String row = "R"+i+"-"+num;
                String col = "C"+j+"-"+num;
                String box = "B"+(i/3)*3+(j/3)+"-"+num;

                if(set.contains(row) || set.contains(col) || set.contains(box)){
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}
