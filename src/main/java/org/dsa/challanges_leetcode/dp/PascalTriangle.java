class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> dp = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            dp.add(1);

            for (int j = i - 1; j > 0; j--) {
                dp.set(j, dp.get(j) + dp.get(j - 1));
            }
        }

        return dp;
    }
}