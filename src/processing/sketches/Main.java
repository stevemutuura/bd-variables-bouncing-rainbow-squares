package processing.sketches;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import processing.core.PApplet;

public class Main extends PApplet {
    private static final Log log = LogFactory.getLog(Main.class);
    // --> Instance variables
    private float xPos = 300f;
    private float yPos = 300f;
    private int sideLength = 30;
    private float xVel = -5f;
    private float yVel = -8f;
    private int hue = 0;

    public void settings() {

        size(600, 600);
    }

    public void setup() {
        background(0, 0, 0);
        colorMode(HSB);
        noStroke();
    }

    public void draw() {
        fill(255, 255, 255);
        rect(xPos, yPos, sideLength, sideLength);

        xPos += xVel;
        yPos += yVel;

        if (xPos <= 0) {
            xPos = 0;
            xVel *= -1;
        }

        if (yPos <= 0) {
            yPos = 0;
            yVel = -yVel;
        }

        if (xPos + sideLength >= width) {
            xPos = width;
            xVel = -xVel;
        }

        if (yPos + sideLength >= height) {
            yPos = height -sideLength;
            yVel *= -1;
        }

    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");
    }
}

//If you make a variable it has a scope of where it exists.
