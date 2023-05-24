public class firstandlast {
        public int[] searchRange(int[] arr, int search) {
            int[] ans={-1,-1};
            int start=search(arr,search,true);
            int end=search(arr,search,false);
            ans[0]=start;
            ans[1]=end;
            return ans;
        }

        int search(int[] arr, int search, boolean findstartindex) {
            int ans=-1;
            int start=0;
            int mid=0;
            int end=arr.length-1;
            while(start<=end) {
                mid=start+(end-start)/2;
                if(arr[mid]>search){
                    end=mid-1;
                } else if(arr[mid]<search){
                    start=mid+1;
                } else {
                    ans=mid;
                    if(findstartindex){
                        end=mid-1;
                    } else {
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
/*
This code searches for a target value in a sorted integer array and returns the starting and ending positions of all occurrences of the target value in the array. If the target value is not found in the array, it returns -1 for both starting and ending positions.

The code uses binary search algorithm to find the positions of the target value. In the searchRange() function, it initializes an array of size 2 with values -1 and uses the search() function to find the starting and ending positions of the target value by performing two binary search operations.

The search() function takes the input array, the target value, and a boolean flag to indicate whether to find the starting or ending position of the target value. It uses the binary search algorithm to find the position of the target value in the array. Once the target value is found, it updates the starting or ending position depending on the flag and continues the binary search until all occurrences of the target value are found.

Overall, the code performs two binary search operations to find the starting and ending positions of the target value in the input array and returns them in an array of size 2.
 */