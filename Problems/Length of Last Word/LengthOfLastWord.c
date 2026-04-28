int lengthOfLastWord(char* s) {

    int length = 0;
    int space = 1;

    for (int i = 0; s[i] != '\0'; i++) {
        
        if (s[i] == ' ') {
            space = 0;
        }
        else {
            length = (length * space) + 1;
            space = 1;
        }
    }

    return length;

}
