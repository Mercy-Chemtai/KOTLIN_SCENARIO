fun main(args: Array<String>) {
    println (sum(20,30))
    val myArray = intArrayOf(1, 2, 3, 4, 5)
    println("The sum of the elements in the array is: \$result")

    val originalArray = intArrayOf(76, 23, 45, 12, 54, 9,8)
    println("Original Array: ${originalArray.contentToString()}")

    val sortedArray = sortAndMerge(originalArray)
    println("Sorted Array: ${sortedArray.contentToString()}")

}

//Write a function that takes two integers as parameters and returns their sum.

fun  sum( num1:Int , num2:Int):Int{
    var numSum = num1 + num2
    return numSum

}

//Write a function that takes an array of integers as a parameter and returns the sum of all the elements.




//divide the array into two
fun sortAndMerge(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr // Base case: already sorted or empty array

    val middleIndex = arr.size / 2
    val leftArray = arr.sliceArray(0 until middleIndex)
    val rightArray = arr.sliceArray(middleIndex until arr.size)

    return mergeArray(sortAndMerge(leftArray), sortAndMerge(rightArray))
}
//compare the elements in the two arrays
fun mergeArray(leftArray: IntArray, rightArray: IntArray): IntArray {
    val mergedArray = IntArray(leftArray.size + rightArray.size)
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0

    while (leftIndex < leftArray.size && rightIndex < rightArray.size) {
        if (leftArray[leftIndex] <= rightArray[rightIndex]) {
            mergedArray[mergedIndex] = leftArray[leftIndex]
            leftIndex++
        } else {
            mergedArray[mergedIndex] = rightArray[rightIndex]
            rightIndex++
        }
        mergedIndex++

    }

    // Add any remaining elements from left or right arrays
    while (leftIndex < leftArray.size) {
        mergedArray[mergedIndex] = leftArray[leftIndex]
        leftIndex++
        mergedIndex++
    }
    while (rightIndex < rightArray.size) {
        mergedArray[mergedIndex] = rightArray[rightIndex]
        rightIndex++
        mergedIndex++
    }

    return mergedArray
}
//merge sort is usually done recursively
//using  divide and conquer




