class MinStack() {

    private val stack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addLast(`val`)

    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last()

    }

    fun getMin(): Int {
 
        val tmp = ArrayDeque<Int>()
        var min = stack.last()

        while(stack.isNotEmpty()){
            min = minOf(min, stack.last)
            tmp.addLast(stack.removeLast())

        }

        while(tmp.isNotEmpty()){
            stack.addLast(tmp.removeLast())
        }
         return min

    }
}
