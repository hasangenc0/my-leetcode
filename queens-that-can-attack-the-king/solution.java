class Solution {
    boolean isInsideTheBoard(int row, int col) {
      return row >= 0 && row < 8 && col >= 0 && col < 8;    
    }
  
    boolean[][] getBoardState(int[][] queens) {
      boolean[][] board = new boolean[8][8];
      for(int[] queen: queens) {
        board[queen[0]][queen[1]] = true;
      }
      
      return board;
    }
  
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
      List<List<Integer>> result = new ArrayList<List<Integer>>(8);
      boolean[][] board = getBoardState(queens);

      for (int d1 = -1; d1 <= 1; d1++) {
        for(int d2 = -1; d2 <= 1; d2++) {
          if (d1 == 0 && d2 == 0) {continue;}

          int row = king[0];
          int col = king[1];
          while(isInsideTheBoard(row, col) && !board[row][col]) {
            row += d1;
            col += d2;
          }

          if(isInsideTheBoard(row, col)) {
            List<Integer> coords = Arrays.asList(row, col);
            result.add(coords);
          }

        }
      }
      
      return result;
    }
}
