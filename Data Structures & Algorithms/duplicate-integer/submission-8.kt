class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val result = mutableSetOf<Int>()

        for (i in nums){

            if(i in result){
                return true
            }
            result.add(i)
        }
        return false

    }
}
