object InsertionSort {

  def insertionSort(arr: Array[Int]): Array[Int] =  {
 
    for (i <- 0 until arr.length; j <- i until 0 by -1) {

	  	if (arr(j - 1) > arr(j)) {
	  	  val backup = arr(j - 1)
	  	  arr(j - 1) = arr(j)
	  	  arr(j) = backup
	  	}
    
    }
    
    arr
	}
}