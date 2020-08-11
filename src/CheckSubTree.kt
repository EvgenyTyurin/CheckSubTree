import java.lang.StringBuilder

/**
 * Check if small tree is a subtree of big
 * Solution: Represent each tree as string an check substring
 */

fun main() {
    // Init small tree
    val small2 = BinaryTreeNode(2)
    val small4 = BinaryTreeNode(4)
    val small5 = BinaryTreeNode(5)
    small2.setChildLeft(small4)
    small2.setChildRight(small5)
    // Init big tree
    val big1 = BinaryTreeNode(1)
    val big2 = BinaryTreeNode(2)
    val big3 = BinaryTreeNode(3)
    val big4 = BinaryTreeNode(4)
    val big5 = BinaryTreeNode(5)
    big1.setChildLeft(big2)
    big1.setChildRight(big3)
    big2.setChildLeft(big4)
    big2.setChildRight(big5)
    // Print result
    println("Small is subtree of big? " + checkSubTree(small2, big1))
}

// Check if small is subtree of big
fun checkSubTree(rootSmall: BinaryTreeNode, rootBig: BinaryTreeNode): Boolean {
    val smallTreeStr = StringBuilder()
    treeToString(rootSmall, smallTreeStr)
    val bigTreeStr = StringBuilder()
    treeToString(rootBig, bigTreeStr)
    return bigTreeStr.contains(smallTreeStr)
}

// Represents tree as a string
fun treeToString(node: BinaryTreeNode?, str: StringBuilder) {
    if (node == null)
        return
    str.append(node.getData())
    treeToString(node.getChildLeft(), str)
    treeToString(node.getChildRight(), str)
}