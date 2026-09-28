class Solution {
    fun maxProfit(prices: IntArray): Int {

        var maxProfit = 0

        var minPrice = prices[0]

            for(i in 1 until prices.size){

                val currentPrice = prices[i]

                if(currentPrice< minPrice){

                    minPrice = currentPrice
                }

                var profit = currentPrice - minPrice

                if(profit> maxProfit){

                    maxProfit = profit
                }
            }

            return maxProfit




    }
}
