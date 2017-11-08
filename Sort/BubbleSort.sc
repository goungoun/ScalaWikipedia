object BubbleSort {
  
  def bubbleSort(arr: Array[Int]):Array[Int] =  {
    for(i <- 0 until arr.length ; j <- (i + 1) until arr.length) {
      val tmp = arr(i)
      
      if (arr(i) > arr(j)) {
        arr(i) = arr(j)
        arr(j) = tmp
      }
    }
    arr
  }
  
}