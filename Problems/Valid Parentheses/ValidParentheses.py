class Solution:
    def isValid(self, s: str) -> bool:
        
        P = []

        for c in s:
            if (c == '(' or c == '[' or c == '{'):
                P.append(c)
            elif P == []:
                return False
            elif (c == ')'):
                if (P.pop() != '('):
                    return False
            elif (c == ']'):
                if (P.pop() != '['):
                    return False
            elif (c == '}'):
                if (P.pop() != '{'):
                    return False
            else:
                return False
        
        return P == []
