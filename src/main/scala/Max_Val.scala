import scala.util.control.Breaks._


object Max_num extends App {
  var list=List(30,20,40,10)
  var arr:Array[Int]=list.toArray
  def sort(arr:Array[Int]): Unit ={
for (i <-0 until arr.length-1;j<-0 until arr.length-1-i){
  if(arr(j)>arr(j+1)){
    val temp=arr(j)
arr(j)=arr(j+1)
    arr(j+1)=temp
print(arr)
  }
}
    //println(arr.last)


  }
  //println(arr.last)
}
