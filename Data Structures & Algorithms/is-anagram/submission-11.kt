class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        val cleanS = s.replace(" ","").lowercase()
        val cleanT = t.replace(" ","").lowercase()

        if(cleanS.length != cleanT.length){
            return false
        }

        val resultS = mutableMapOf<Char,Int>()
        val resultT = mutableMapOf<Char,Int>()

        for(i in s.indices){
             
                        resultS[cleanS[i]] = resultS.getOrDefault(cleanS[i],0) + 1

            resultT[cleanT[i]] = resultT.getOrDefault(cleanT[i],0) + 1

        }

        return resultS == resultT

    }
}
