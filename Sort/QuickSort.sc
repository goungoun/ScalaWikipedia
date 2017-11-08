object QuickSort {
 
  def quickSort(arr:Array[Int]):Array[Int] = {
  
    if (arr.length <= 1) return arr
  
  	val pivot = arr(arr.length / 2)
  	
  	var left = Array[Int]()
  	var right = Array[Int]()
 
    for (a <- arr) {
      if (a < pivot) left = left :+ a
      else if (a > pivot) right = right :+ a
    }
  	
  	quickSort(left) ++ Array(pivot) ++ quickSort(right)
  	
  }
  
}