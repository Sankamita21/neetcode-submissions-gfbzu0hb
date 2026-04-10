class Solution {
    fun isPalindrome(s: String): Boolean {

        val formattedString = s.filter{it.isLetterOrDigit()}.lowercase()

        var left = 0
        var right = formattedString.length-1

        while(left<right)
        {
            if(formattedString[left]!= formattedString[right]){
            return false

            }

            left++
            right--
            
        }
        
        return true

    }
}
