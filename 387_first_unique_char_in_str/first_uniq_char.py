class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        for i in s:
            if s.index(i) == s.rindex(i):
                return s.index(i)
        return -1
        # seen = set()
        # for i in range(len(s)-1):
        #     char = s[i]
        #     rest_of_str = s[i+1:]
            
        #     repeat_index = rest_of_str.find(char)
        #     # print(char, rest_of_str, repeat_index)
        #     if repeat_index == -1 and char not in seen:
        #         return i
        #     seen.add(char)
        # if s[len(s)-1:] not in seen:
        #     return len(s)-1
        # return -1
        