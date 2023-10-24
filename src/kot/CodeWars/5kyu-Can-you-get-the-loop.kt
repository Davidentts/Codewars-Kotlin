package kot.CodeWars

import java.util.*

/*
*   Node can be null. However, by the condition of the problem,
*   we know that a loop is always waiting for us, so we can use
*   the operator "!!"
*/

fun loopSize(n: Node): Int {
    val setNode = mutableSetOf<Node>()
    var node: Node? = n
    while(setNode.add(node!!)) {
        node = node?.next
    }
    return setNode.lastIndexOf(setNode.last()) - setNode.indexOf(node) + 1