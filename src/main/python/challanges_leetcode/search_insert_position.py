nums = [1,3,5,6]
target = 5

for i in range(len(nums)):
    if target <= nums[i]:
        return i
return len(nums)
