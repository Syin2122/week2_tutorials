class Solution {
    public static void findLongestStreak(String signalLog) {
        int count = 1;
        int max = 1;
        char color = signalLog.charAt(0);
        char maxColor = color;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == color) {
                count++;
            } else {
                color = signalLog.charAt(i);
                count = 1;
            }

            if (count > max) {
                max = count;
                maxColor = color;
            }
        }

        System.out.println("Longest Streak: '" + maxColor +
                           "' repeated " + max + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}
