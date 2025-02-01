import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficApplet extends JApplet
{
	public final int WIDTH = 300;
	public final int HEIGHT = 400;

	public final int X_TRAFFICLIGHT = WIDTH/3;
	public final int Y_TRAFFICLIGHT = HEIGHT/7;
	public final int TRAFFICLIGHT_WIDTH = WIDTH/2;
	public final int TRAFFICLIGHT_HEIGHT = HEIGHT*3/5;
	public final int LIGHT_DIAMETER = TRAFFICLIGHT_HEIGHT/5;
	public final int HOOD_START_ANGLE = 20;
   public final int HOOD_ANGLE_SWEPT = 140;
   public final int X_LIGHTS = TRAFFICLIGHT_WIDTH/3 + X_TRAFFICLIGHT;
	public final int Y_REDLIGHT = TRAFFICLIGHT_HEIGHT/10 + Y_TRAFFICLIGHT;
	public final int Y_ORANGELIGHT = TRAFFICLIGHT_HEIGHT*4/10 + Y_TRAFFICLIGHT;
	public final int Y_GREENLIGHT = TRAFFICLIGHT_HEIGHT*7/10 + Y_TRAFFICLIGHT;
	public final int TIME_DELAY = 1000;
	
	private String status = "green";	//start with the green light
	private Timer timer;	//will allow lights to cycle
	

	public void init()
	{
		//create a timer object and register an Action Listener
		timer = new Timer (TIME_DELAY, new TimerListener());
		//start the light cycle
		timer.start();		
	}

	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent action)
		{
			//changes a red light to a green light
			if (status.equals("red"))
			{
				status = "green";
			}
			//changes a green light to an orange light
			else if (status.equals("green"))
			{
				status = "orange";
			}
			//changes an orange light to a red light
			else if (status.equals("orange"))
			{
				status = "red";
			}
			
			//redraw the applet
			repaint();
		}
	}

	public void paint (Graphics g)
	{
		super.paint(g);
		
		//draw the yellow traffic signal rectangle
		g.setColor(Color.yellow);
		g.fillRect(X_TRAFFICLIGHT, Y_TRAFFICLIGHT, TRAFFICLIGHT_WIDTH, TRAFFICLIGHT_HEIGHT);

		//draw the red light
      g.setColor(Color.red);
      g.drawOval(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER);
      if(status.equals("red"))
      {
  	 		g.fillOval(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER);
		}
		
		//draw the hood for the red light
		g.setColor(Color.black);
		g.drawArc(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER, HOOD_START_ANGLE, HOOD_ANGLE_SWEPT);

		//draw the green light
		g.setColor(Color.green);
		g.drawOval(X_LIGHTS, Y_GREENLIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER);
		if(status.equals("green"))
      {
	   	g.fillOval(X_LIGHTS, Y_GREENLIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER);
		}
  
  		//draw the hood for the green light
      g.setColor(Color.black);
      g.drawArc(X_LIGHTS, Y_GREENLIGHT,LIGHT_DIAMETER, LIGHT_DIAMETER, HOOD_START_ANGLE, HOOD_ANGLE_SWEPT);

		//draw the orange light
      g.setColor(Color.orange);
		g.drawOval(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER);
		if(status.equals("orange"))
		{
			g.fillOval(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER);
		}
			
		//draw the hood for the orange light	
		g.setColor(Color.black);
		g.drawArc(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER, LIGHT_DIAMETER, HOOD_START_ANGLE, HOOD_ANGLE_SWEPT);
	}
}

