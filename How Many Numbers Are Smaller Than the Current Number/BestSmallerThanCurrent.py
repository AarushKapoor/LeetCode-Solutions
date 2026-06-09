class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = [0] * len(nums)

        counts = [0] * 101

        for num in nums:
            counts[num] += 1
        
        for i in range(1,101):
            counts[i] += counts[i-1]
        
        for i, num in enumerate(nums):
            if num == 0:
                ans[i] = 0
            else:
                ans[i] = counts[num - 1]

        return ans
