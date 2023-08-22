class zigzagconversion {
// Method Convert takes a string s and prints it in (int) Numrows number of rows
// as a zigzag
// zigzag is defined as being in a 2 dimensional grid with column x and and row y
// there is no change in x, only y until y equals Numrows, then letters are placed in x+1, y-1 until y == 0, then repeat untill end of string.

// The number of total columns will equal
// length s/ (numRows + (numrows-1))
// Finally print the grid by row order
    public static String convert(String s, int numRows) {

        int maxlength = (s.length()/(2*numRows - 1) * numRows);
        if (s.length()%(2*numRows - 1) > numRows) {
          maxlength = maxlength + (s.length()%(2*numRows - 1)- numRows);
        };
        
        // Column
          int x = 0;
        //  Row
          int y = 0;
          boolean zigzag = false;

        String[] ansStr = new String[numRows];
        for (char elem : s.toCharArray()) {
          if (y >= numRows-1) {
            zigzag = true;
          } else if (y == 0) {
            zigzag = false;
          } 
          if (ansStr[y] != null){
            ansStr[y] = ansStr[y] + elem;
          } else {
            ansStr[y] = String.valueOf(elem);
          }
          if (zigzag) {
            x = x+1;
            if (y > 0){
              y  = y-1;
            }
          } else {
            if (y < numRows){
              y = y+1;
            }
          }
        }
        String answerStr = "";
        for (String elem : ansStr){
          if (elem != null){
            answerStr = answerStr + elem;
          }
        }
      return answerStr;
    }

    // Paypal is hiring
    // String zigans = Solution.convert("PAYPALISHIRING")
    public static void main(String[] args) {
      System.out.println(zigzagconversion.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
      // zigzagconversion.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR");
    }
}

