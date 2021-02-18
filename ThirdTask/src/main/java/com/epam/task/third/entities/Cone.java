package com.epam.task.third.entities;

public class Cone {
    private final double x;
    private final double y;
    private final double z;
    private final double baseRadius;
    private final double height;

    public Cone(double x, double y, double z, double baseRadius,double height){
        this.x = x;
        this.y = y;
        this.z = z;
        this.baseRadius = baseRadius;
        this.height = height;

    }

    public double getBaseRadius(){
        return baseRadius;
    }

    public double getHeight(){
        return height;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

}
