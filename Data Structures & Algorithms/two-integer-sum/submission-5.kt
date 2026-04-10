class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

//two pointer patter use only sorted array given input make sure make it sorted before using two sorted
          val indexNumber = nums.withIndex().sortedBy{it.value}

          var left = 0
          var right = indexNumber.size - 1

          while(left<right)
          {
            val sum = indexNumber[left].value + indexNumber[right].value

            when{
                sum == target ->  return intArrayOf(
                        minOf(indexNumber[left].index, indexNumber[right].index),
                        maxOf(indexNumber[left].index, indexNumber[right].index)
                    )
                sum < target -> left++
                else -> right--

            }
          } 
          return intArrayOf()
    }
}
