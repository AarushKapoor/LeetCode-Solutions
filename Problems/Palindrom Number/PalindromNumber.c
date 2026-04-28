bool isPalindrome(int x) {
    
    if (x < 0) {
        return false;
    }
    else if (x == 0) {
        return true;
    }

    int numDigits = 0;
    int n = x;

    while (n > 0) {
        n = n / 10;
        numDigits++;
    }

    int nums[numDigits];

    for (int i = 0; i < numDigits; i++) {
        nums[i] = x % 10;
        x /= 10;
    }

    for (int i = 0; i < numDigits/2; i++) {
        if (nums[i] != nums[numDigits-1-i]){
            return false;
        }
    }

    return true;

}
