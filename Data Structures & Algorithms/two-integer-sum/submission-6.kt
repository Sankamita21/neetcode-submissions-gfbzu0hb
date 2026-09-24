class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

      val map = mutableMapOf<Int,Int>()
        for(i in nums.indices)
            {
           val currentValue = nums[i]
           val needed = target - currentValue
              
         if(map.contains(needed)){
            return intArrayOf(map[needed]!!,i)
         }
       map[currentValue] = i

           }

            return intArrayOf()
    }
}
