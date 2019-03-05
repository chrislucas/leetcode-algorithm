import kotlin.math.abs

/**
 * https://leetcode.com/problems/two-sum/
 * */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mp1 = mutableMapOf<Int, Int>()
        nums.forEachIndexed { idx, value -> mp1[idx] = target - value }
        val rs = IntArray(2)
        for ( (k, v) in mp1) {
            for (i in k+1 until nums.size) {
                if (nums[i] == v) {
                    rs[0] = k
                    rs[1] = i
                    break
                }
            }
        }
        return rs
    }
}


fun main(args: Array<String>) {
    //val rs = Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
    //val rs = Solution().twoSum(intArrayOf(2, 7, 11, 15), 17)
    //val rs = Solution().twoSum(intArrayOf(3, 3), 6)
    //val rs = Solution().twoSum(intArrayOf(-1,-2,-3,-4,-5), -8)
    //val rs = Solution().twoSum(intArrayOf(3, 2, 4), 6)
    val rs = Solution().twoSum(intArrayOf(3, 2, 4), 5)
    println("[${rs[0]}, ${rs[1]}]")
}