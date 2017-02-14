package com.company;

public class Point {
    String name;
    int coordX;
    int coordY;

    public Point(String name, int coordX, int coordY) {
        this.name = name;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }


    public int getCoordY() {
        return coordY;
    }

    public Point() {
    }

    public int getDistance(Point point) {
        double distance = Math.sqrt((this.getCoordX() - point.getCoordX()) * (this.getCoordX() - point.getCoordX()) + (this.getCoordY() - point.getCoordY()) * (this.getCoordY() - point.getCoordY()));
        return (int) distance;
    }
    public boolean isHigher(Point point){
        boolean isHigher;
        if (this.getCoordY()>point.getCoordY()){
            return isHigher=true;
        }
        else{
        return isHigher=false;
        }
    }
}
