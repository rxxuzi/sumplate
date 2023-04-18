import java.awt.{Color, Graphics}
import javax.swing.JPanel

class Core() extends JPanel{
  //paint circle
  this.setBackground(Color.BLACK)

  override def paintComponents(g: Graphics): Unit = {
    super.paintComponents(g)
    draw(g)
    drawGrid(g)
  }

  private def drawGrid(g: Graphics): Unit = {
    g.setColor(Color.WHITE)
    for (i <- 0 until this.getWidth by 100) {
      g.drawLine(i, 0, i, getHeight)
    }
  }

  private def draw(g: Graphics): Unit = {

  }
}
