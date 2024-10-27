def rotate(nums, k):
    n = len(nums)
    k %= n  # In case k is greater than the length of the array

    
    def reverse(start, end):
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start, end = start + 1, end - 1
    

    reverse(0, n - 1)
    
    
    reverse(0, k - 1)
    
    
    reverse(k, n - 1)
    
    return nums  # returning for convenience



