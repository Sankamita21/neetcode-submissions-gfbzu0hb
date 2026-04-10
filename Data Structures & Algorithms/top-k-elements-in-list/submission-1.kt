class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val count = mutableMapOf<Int, Int>()

        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }

        val sorted = count.entries.sortedByDescending { it.value }

        return sorted
            .take(k)
            .map { it.key }
            .toIntArray()
    }
}
