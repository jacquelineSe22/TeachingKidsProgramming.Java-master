package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    //
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //     Remove previous bubbles from your program window --#9
    programWindow.removePaintable();
    int radius = NumberUtils.getRandomInt(10, 50);
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setCenter(x, y);
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}