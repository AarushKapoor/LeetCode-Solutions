class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """

        longestPrefix = min(strs)
        
        for word in strs:

            if (longestPrefix == ""):
                break
            
            currentPrefix = ""

            for i in range(0, len(longestPrefix)):
                
                if (word[i] == longestPrefix[i]):
                    currentPrefix += word[i]
                else:
                    longestPrefix = currentPrefix
                    break
        
        return longestPrefix
