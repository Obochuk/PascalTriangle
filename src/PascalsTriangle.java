public class PascalsTriangle {
    public static int[][] pascal(int depth) {
        if (depth < 1)
            throw new IllegalArgumentException();
        int[][] result = new int[depth][];
        for (int i = 0; i < depth; i++) {
            result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++){
                result[i][j] = (j == 0 || j == i? 1:
                        result[i - 1][j - 1] + result[i - 1][j]);
            }
        }

        return  result;
    }
}