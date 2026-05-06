int removeDuplicates(int* nums, int numsSize) {

    int pointer = 0;

    for (int i = 1; i < numsSize; i++) {
        if (nums[i] != nums[pointer]) {
            pointer++;
            nums[pointer] = nums[i];
        }
    }

    return pointer + 1;
    
}
