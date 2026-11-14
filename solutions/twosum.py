class Solution(object):
    def twoSum(self, nums, target):
        i = 0
        j = 1
        while nums[i] + nums[j] != target:
            j += 1
            if j == len(nums):
                i += 1
                j = i + 1
        return [i, j]

print(Solution().twoSum([3, 2, 4], 6))
            