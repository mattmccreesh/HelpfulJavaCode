import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.util.concurrent.TimeUnit;
import java.awt.Point;
public class MouseMover
{
	public static void main (String[] args)
	{
		try{
			PointerInfo a;
			Point b;
			int x;
			int y;
			Robot r = new Robot();
			while(true){
				r.mouseMove(600,600);
				TimeUnit.SECONDS.sleep(1);
				a = MouseInfo.getPointerInfo();
				b = a.getLocation();
				x = (int) b.getX();
				y = (int) b.getY();
				if(x != 600 || y != 600)
					return;
				r.mouseMove(650, 650);
				TimeUnit.SECONDS.sleep(1);
				a = MouseInfo.getPointerInfo();
				b = a.getLocation();
				x = (int) b.getX();
				y = (int) b.getY();
				if(x != 650 || y != 650)
					return;
			}
		}
		catch (Exception e)
		{
		}
	}
}