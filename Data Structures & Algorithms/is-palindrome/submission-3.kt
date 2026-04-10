class Solution {
    fun isPalindrome(s: String): Boolean {
  var input = s.lowercase().filter{it.isLetterOrDigit()}

        var left = 0
        var right = input.length - 1

        while(left<right){
            if(input[left]!=input[right])
            {
                return false
            }
            left++
            right--
        }
            return true
    }
}
