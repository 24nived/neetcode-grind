class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        int [] row = new int [9];
        int [] col = new int [9];
        int [] box = new int [9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;

                int num = (board[i][j])-'1';

                int mask = 1<<num;
                int b = (i/3)*3+(j/3);

                if((row[i] & mask)!=0 ||(col[j] & mask)!=0 ||(box[b] & mask)!=0){
                    return false;
                }

                row[i] |= mask;
                col[j] |=mask;
                box[b] |=mask;


                // String row = "R"+i+"-"+num;
                // String col = "C"+j+"-"+num;
                // String box = "B"+(i/3)*3+(j/3)+"-"+num;

                // if(set.contains(row) || set.contains(col) || set.contains(box)){
                //     return false;
                // }
                // set.add(row);
                // set.add(col);
                // set.add(box);
            }
        }
        return true;
    }
}
