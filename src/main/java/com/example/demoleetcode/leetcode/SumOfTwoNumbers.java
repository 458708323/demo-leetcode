package com.example.demoleetcode.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author zhaohui
 * @create 2019/6/20 7:11 PM
 */
public class SumOfTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int param = target - nums[i];
            if (map.containsKey(param) && map.get(param) != i) {
                return new int[]{i, map.get(param)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        System.out.println(JSON.toJSONString(sumOfTwoNumbers.twoSum(nums, 6)));
    }
}
