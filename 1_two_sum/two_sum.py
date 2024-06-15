class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # brute force
        # for i in range(len(nums)):
        #     first_num = nums[i]
        #     for j in range(i+1, len(nums)):
        #         total = first_num + nums[j]
        #         if total == target:
        #             return [i, j]
        
        #optimized
        map = {}
        for i in range(len(nums)):
            goal = target - nums[i]
            if goal in map:
                return [map[goal], i]
            map[nums[i]] = i
        
        