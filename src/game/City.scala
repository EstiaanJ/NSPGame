package game

import processing.core.PApplet

class City(val x: Double, val y: Double, var pop: Int, var demand: Double, var radius: Double) {


  def draw(context: PApplet): Unit ={
    context.ellipse(this.x.toFloat,this.y.toFloat,10F,10F)
    val cityName = "Name";
    val cityPop = "Pop: " + this.pop;
    context.text(cityName, (x + 10).toFloat, (y).toFloat)
    context.text(cityPop, (x + 10).toFloat, (y + 11).toFloat)
  }

  def pointOverlap(mx: Double, my: Double): Boolean = {
    val disSqr = (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)
    val radSqr = this.radius * this.radius
    if (disSqr < radSqr) return true
    else return false
  }
}
