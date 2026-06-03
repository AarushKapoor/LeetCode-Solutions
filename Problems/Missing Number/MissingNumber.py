class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        numSet = set()

        for num in nums:
            numSet.add(num)
        
        for i in range(len(nums) + 1):
            if i not in numSet:
                return i
        
        return -1
