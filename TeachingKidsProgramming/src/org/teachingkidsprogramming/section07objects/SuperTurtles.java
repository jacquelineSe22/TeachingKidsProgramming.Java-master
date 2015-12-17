package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    makeSlowTurtle();
    makeCrazyTurtle();
  }
  private void makeCrazyTurtle()
  {
    Turtle crazyTurtle = new Turtle();
    mtw.addAndShowTurtle(crazyTurtle);
    crazyTurtle.drawLightning(55);
  }
  private void makeSlowTurtle()
  {
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    slowTurtle.drawTriangle(-50);
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    myDrawTriangle(speedyTurtle);
  }
  private void myDrawTriangle(Turtle speedyTurtle)
  {
    for (int i = 0; i < 3; i++)
    {
      speedyTurtle.turn(360 / 3);
      speedyTurtle.move(100);
    }
  }
}
