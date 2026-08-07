class Solution(object):
    def lengthOfLongestSubstring(self, s):
        max_len = 0

        for i in range(len(s)):
            result = ""
            for j in range(i, len(s)):
                if s[j] in result:
                    break
                result += s[j]

            if len(result) > max_len:
                max_len = len(result)
        
        return max_len
