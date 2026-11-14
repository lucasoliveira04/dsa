class Solution:
    def findLHS(self, nums: List[int]) -> int:
        frequency = {}

        for num in nums:
            frequency[num] = frequency.get(num, 0) + 1

        result = 0

        for num in frequency:
            if num + 1 in frequency:
                result = max(result, frequency[num] + frequency[num + 1])


        return result


Solution().findLHS([1, 3, 2, 2, 5, 2, 3, 7])