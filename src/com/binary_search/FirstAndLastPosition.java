package com.binary_search;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        // check for first occurence if target first
        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                end=mid-1;
            }
            else if(nums[mid]>target){
                start=mid+1;
            }
            else{
                // potential ans found
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
