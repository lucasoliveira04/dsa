class Solution {
    public String removeDuplicateLetters(String s) {
        Set<Character> set = new HashSet<>();
        int[] freq = new int[26];
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            if (set.contains(c)) {
                continue;
            }

            while (
                result.length() > 0 &&
                result.charAt(result.length() - 1) > c &&
                freq[result.charAt(result.length() - 1) - 'a'] > 0
            ) {
                char last = result.charAt(result.length() - 1);

                set.remove(last);
                result.deleteCharAt(result.length() - 1);
            }

            result.append(c);
            set.add(c);
        }

        return result.toString();
    }
}