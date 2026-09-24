class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val map = mutableMapOf<Int,Int>()

        for(num in nums){

            map[num] = map.getOrDefault(num,0) + 1
        }

        for(num in nums)
        {
            if(map[num] != 1)
            {
                return true
            }

        }
       
return false
    }
}
