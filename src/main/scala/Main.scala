import javax.swing.JFrame

object Main {
  def main(args: Array[String]): Unit = {
    val frame = new JFrame()
    frame.setSize(1000, 1000)
    frame.setVisible(true)
    frame.setDefaultCloseOperation(3)
    frame.setTitle("sum plate")
    frame.add(
      new Core()
    )
    //フレームの大きさを変えられないようにする
    frame.setResizable(false)
  }
}