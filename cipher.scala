object Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

  val encript =(w:Char,x:Int,a:String)=>if(a.contains(w)) a((a.indexOf(w)+x)%a.length) else w

  val decript = (w:Char,x:Int,a:String)=>if(a.contains(w)) a((a.indexOf(w)-x)%a.length) else w

  val cipher = (algo:(Char,Int,String)=>Char,s:String,k:Int,a:String)=>s.map(algo(_,k,a))

  val x = "Vihanga98"

  val y =cipher(encript,x,5,alphabet)

  println(y)

  println(cipher(decript,y,5,alphabet))
}
