package Week_2.Day_2;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        for (char ch : s1.toCharArray()) {
            countS1[ch - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            countS2[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                countS2[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (areCountsEqual(countS1, countS2)) {
                return true;
            }
        }

        return false;
    }

    private boolean areCountsEqual(int[] countS1, int[] countS2) {
        for (int i = 0; i < 26; i++) {
            if (countS1[i] != countS2[i]) {
                return false;
            }
        }
        return true;
    }
}
