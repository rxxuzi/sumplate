import java.awt.event.{KeyAdapter, KeyEvent}
import java.awt.{Color, Graphics}
import javax.swing.JPanel

class Core() extends JPanel{
   //paint circle
   this.setBackground(Color.BLACK)
   //  this.addKeyListener(new KeyInput())
   override def paintComponents(g: Graphics): Unit = {
      super.paintComponents(g)
      draw(g)
   }

   private def drawGrid(g: Graphics): Unit = {
      g.setColor(Color.WHITE)
      for (i <- 0 until this.getWidth by 100) {
         g.drawLine(i, 0, i, getHeight)
      }
   }

   private def draw(g: Graphics): Unit = {
      g.fillOval(10,10,10,10)
   }

   private class KeyInput() extends  KeyAdapter{
      override def keyPressed(e: KeyEvent): Unit = {
         println(e.getKeyCode)
      }
   }

}
