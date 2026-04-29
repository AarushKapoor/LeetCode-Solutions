#include <string.h>

bool isValid(char* s) {

    char P[strlen(s)];
    int end = -1;

    for (int i = 0; s[i] != '\0'; i++) {

        if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
            P[++end] = s[i];
        }
        else if (end == -1) {
            return false;
        }
        else if (s[i] == ')') {
            if (P[end--] != '(') {
                return false;
            }
        }
        else if (s[i] == ']') {
            if (P[end--] != '[') {
                return false;
            }
        }
        else if (s[i] == '}') {
            if (P[end--] != '{') {
                return false;
            }
        }

    }

    return end == -1;
    
}
