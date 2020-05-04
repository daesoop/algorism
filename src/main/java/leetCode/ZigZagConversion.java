package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {
        Solution21 solution = new Solution21();
        String s = "PAYPALISHIRING";
        int numRows = 3;

        solution.convert(s, numRows);
    }
}

class Solution21 {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
