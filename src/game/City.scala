package game

import processing.core.PApplet

class City(val x: Double, val y: Double, var pop: Int, var demand: Double) {


  def draw(context: PApplet): Unit ={
    context.ellipse(this.x.toFloat,this.y.toFloat,10F,10F)
  }
}
