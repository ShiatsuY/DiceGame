object main extends App {

  println("THE DICE!")
  println("----------------------------")
  println("Player 1:")
  val p1 = scala.io.StdIn.readLine()
  println("Player 2:")
  var p2 = scala.io.StdIn.readLine()
  val hp = 20
  println("----------------------------")
  //--------
  val r = new scala.util.Random
  //--------
  logic(hp, hp)

  def logic(p1hp: Int, p2hp: Int): Unit = {
    if (p1hp > 0 && p2hp > 0) {
      println(p1 + " rolls the DICE!")
      val r1 = r.nextInt(6) + 1
      println("=> " + r1 + " DAMAGE!")
      println(p2 + " => " + (p2hp - r1) + " HP")
      //----------------------------------
      println(p2 + " rolls the DICE!")
      val r2 = r.nextInt(6) + 1
      println("=> " + r2 + " DAMAGE!")
      println(p1 + " => " + (p1hp - r2) + " HP")
      println("----------------------------")
      //----------------------------------
      logic(p1hp - r1, p2hp - r2)
    } else {
      if (p1hp > 0) {
        println(p1 + " won!")
      } else if (p2hp > 0) {
        println(p2 + " won!")
      } else {
        println("DRAW!!!")
      }
    }
  }
}
