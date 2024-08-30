class TrafficSignal extends Thread {
    private String color;
    private long duration;

    public TrafficSignal(String color, long duration) {
        this.color = color;
        this.duration = duration;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(color + " Light");
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Change the color
            if (color.equals("Red")) {
                color = "Green";
                duration = 5000; // Green light for 5 seconds
            } else if (color.equals("Green")) {
                color = "Yellow";
                duration = 2000; // Yellow light for 2 seconds
            } else {
                color = "Red";
                duration = 3000; // Red light for 3 seconds
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TrafficSignal red = new TrafficSignal("Red", 3000); // Red light for 3 seconds

        red.start();
     
    }
}