class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length)
         return false
        var resultS = mutableMapOf<Char,Int>()
        var resultT = mutableMapOf<Char,Int>()

        for (i in s.indices){

            resultS[s[i]] = resultS.getOrDefault(s[i],0) + 1
            resultT[t[i]] = resultT.getOrDefault(t[i],0) +1
        }

        return resultS == resultT
         

    }
}
