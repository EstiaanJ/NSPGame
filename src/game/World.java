package game;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Random;

public class World {
    private ArrayList<City> cities = new ArrayList<>();
    private City selected = null;

    public World(int numOfCities,int maxX,int maxY,int maxPop){
        for(int i = 0; i < numOfCities; i++){
            Random rand = new Random();
            cities.add(new City(rand.nextInt(maxX),rand.nextInt(maxY),rand.nextInt(maxPop),rand.nextDouble(),3));
        }
    }

    public City getCitiy(int index){
        return cities.get(index);
    }

    public void drawCities(PApplet context) {
        for (City c: cities) {
            c.draw(context);
        }
    }

    public void setSelected(City selected){
        this.selected = selected;
    }

    public City getSelected(double mx, double my){
        City ret = null;

        for (City c: cities) {
            if(c.pointOverlap(mx,my)){
               ret = c;
               break;
            }
        }

        return ret;
    }
}
