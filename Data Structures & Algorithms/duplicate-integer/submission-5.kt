class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val result = mutableSetOf<Int>()

        for (num in nums){
             if(num in result){
                return true
             }
            result.add(num)
        }
            return false
    }
}
