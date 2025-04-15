package processing.sketches;

import processing.core.PApplet;

public class Main extends PApplet {

    private float xPos = 300f;
    private float yPos = 300f;
    private int sideLength = 30;
    private float xVel = 5f;
    private float yVel = -3f;
    private int hue = 0;


    public void settings() {
        size(600, 600);
    }

    public void setup() {
        colorMode(HSB);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);
        fill(hue, 255, 255);
        rect(xPos, yPos, sideLength, sideLength);
        xPos += xVel;
        yPos += yVel;

        if (xPos <= 0) {
            xPos = 0;
            xVel *= -1;
        }

        if (yPos <= 0) {
            yVel = -yVel;
        }

        if (xPos + sideLength >= width) {
            xPos = width - sideLength;
            xVel = -xVel;
        }

        if (yPos + sideLength >= height) {
            yPos = height - sideLength;
            yVel *= -1;
        }
    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");
    }
}
