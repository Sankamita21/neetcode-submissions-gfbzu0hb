class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val count = mutableMapOf<Int,Int>()

        for(num in nums)
        {
            count[num] = count.getOrDefault(num,0)+1
        }

        val sorteditem = count.entries.sortedByDescending {it.value}
        
        val result = IntArray(k)

        for(i in 0 until k)
        {
            result[i] = sorteditem[i].key
        }
            return result
    }
}
