class Solution {
// Method Convert takes a string s and prints it in (int) Numrows number of rows
// as a zigzag
// zigzag is defined as being in a 2 dimensional grid with column x and and row y
// there is no change in x, only y until y equals Numrows, then letters are placed in x+1, y-1 until y == 0, then repeat untill end of string.

// The number of total columns will equal
//  length s/ (numRows + (numrows-1))
// Finally print the grid by row order
    public String convert(String s, int numRows) {
        // Column
          int x = 0;
        //  Row
          int y = 0;
          boolean zigzag = false;
          char[] answer = [];
        for (char elem : s.toCharArray()) {
          if (y == numRows) {
            zigzag = true;
          }
          if (y == 0) {
            zigzag = false;
          }
          answer[x][y] = elem;
          if (zigzag) {
            x = x+1;
            y = y-1;
          } else {
            y = y+1;
          }

        }
      return answer;
    }
}

// Paypal is hiring
String zigans = Solution.convert("PAYPALISHIRING")
println(zigans.equals("PAHNAPLSIIGYIR"))