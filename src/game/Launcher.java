package game;

import game.City;
import processing.core.PApplet;

import java.util.ArrayList;

public class Launcher extends PApplet{
    World world = new World(10,900,900,9000);

    public static void main(String[] args){
        Launcher.main("game.Launcher");
    }

    public void settings(){
        size(900,900);
    }

    public void setup(){
        noStroke();
    }

    public void draw(){
        background(0);
        world.drawCities(this);
    }
}
