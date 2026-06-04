class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        d = {value: index for index, value in enumerate(nums)}

        for i, num in enumerate(nums):
            if target-num in d and i != d[target-num]:
                return [i, d[target-num]]
