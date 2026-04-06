public class BinarySearch {

    //Easy Q-1
    public static int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s <= e)
        {
            int mid = (s+e)/2;

            if(nums[mid] == target)
            {
                ans = mid;
                return ans;
            }

            else if(nums[mid] > target)
            {
                e = mid-1;
            }

            else
            {
                s = mid +1;
            }
        }

        return ans;
    }

    //Easy Q-2
    public static int searchInsert(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s <= e)
        {
            int mid = (s+e)/2;

            if(nums[mid] == target)
            {
                ans = mid;
                return ans;
            }

            else if(nums[mid] > target)
            {
                e = mid-1;
            }

            else
            {
                s = mid +1;
            }
        }
        ans = s;
        return ans;
    }

    //Easy Q-3
    public static int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = firstOccurence(nums, target);
        result[1] = lastOccurence(nums, target);

        return result;

    }

    public static int firstOccurence(int[] nums, int target)
    {
        int s=0;
        int e=nums.length-1;
        int ans = -1;
        while(s<=e)
        {
            int midIndex = (s+e)/2;
            int midValue = nums[midIndex];

            if(midValue == target)
            {
                ans = midIndex;

                if(midIndex == 0 || nums[midIndex-1] != target)
                {
                    return ans;
                }

                else
                {
                    e = midIndex-1;
                }

            }

            else if(midValue > target)
            {
                e = midIndex-1;
            }

            else
            {
                s = midIndex + 1;
            }
        }

        return ans;
    }

    public static int lastOccurence(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s<=e)
        {
            int midIndex = (s+e)/2;
            int midValue = nums[midIndex];

            if(midValue == target)
            {
                ans = midIndex;

                if(midIndex == nums.length-1 || nums[midIndex+1] != target)
                {
                    return ans;
                }

                else
                {
                    s = midIndex + 1;
                }
            }

            else if (nums[midIndex] > target)
            {
                e = midIndex -1;
            }

            else
            {
                s = midIndex + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args)
    {

        int[] arr = {-1,0,3,5,9,12};
        int target = 9;

        int searchInsertTarget = 10;

        int[] arrsearchRange = {5,7,7,8,8,10};
        int searchRangeTarget = 8;

        int searchResult = search(arr, target);
        int searchInsertResult = searchInsert(arr, searchInsertTarget);
        int[] output = searchRange(arrsearchRange, searchRangeTarget);

        System.out.println("Search Result (index of target): " + searchResult);

        System.out.println("Search Insert Position: " + searchInsertResult);

        System.out.println("Search Range: [" + output[0] + ", " + output[1] + "]");

        //Easy Q-4
        int fo = firstOccurence(arrsearchRange, searchRangeTarget);
        if(fo == -1)
        {
            fo = 0;
        }
        int lo = lastOccurence(arrsearchRange, searchRangeTarget);

        int result = lo-fo+1;
        System.out.println("Count occurence in sorted Array: " + result);


    }
}
