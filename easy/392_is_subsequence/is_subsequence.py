class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) > len(t):
            return False
        if len(s) == 0:
            return True
        # is_seq_maintained = True
        # curr_index = -2
        # rest_of_str = t
        for i in s:
            # print(i)
            # print('index of ', i, 'is', t.find(i))
            
            # print('rest of str is', t)
            if t.find(i) == -1:
                # print(i, 'in false', curr_index, t.find(i), t.find(i))
                return False
            # if .find(i) > curr_index:
                # print(i, 'not false', curr_index, t.find(i))
            else:
                # curr_index = t.find(i)
                t = t[t.find(i)+1:]
                # print('in else', i, curr_index, t)
        return True
        