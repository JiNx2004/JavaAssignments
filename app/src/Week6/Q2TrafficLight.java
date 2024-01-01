package Week6;
import java.util.Timer;
import java.util.TimerTask;

class TrafficLight {
    private String color;
    private int duration; 
    private Timer timer;

    public TrafficLight() {
        color = "Red";
        duration = 30; 
    }

    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public void start() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                changeColor();
            }
        }, duration * 1000, duration * 1000);
    }

    public void stop() {
        if (timer != null) {
            timer.cancel();
        }
    }

    public void changeColor() {
        if (color.equals("Red")) {
            color = "Green";
        } else if (color.equals("Green")) {
            color = "Yellow";
        } else if (color.equals("Yellow")) {
            color = "Red";
        }
        System.out.println("Traffic light changed to " + color);
    }

    public boolean isRed() {
        return color.equals("Red");
    }

    public boolean isGreen() {
        return color.equals("Green");
    }

    public String getColor() {
        return color;
    }

    public void setDuration(int newDuration) {
        duration = newDuration;
        stop();
        start();
    }
}

public class Q2TrafficLight {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("Red", 10); 
        trafficLight.start();


        try {
            Thread.sleep(30000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        trafficLight.stop();
    }
}
