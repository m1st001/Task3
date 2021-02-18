package com.epam.task.third.logic;

import com.epam.task.third.entities.Cone;

public class ConeLogic {


    public double getSurfaceArea(Cone cone){
        double l = Math.pow((Math.pow(cone.getBaseRadius(),2) + Math.pow(cone.getHeight(),2)), 1/2);
        double surfaceArea = Math.PI * cone.getBaseRadius()*(cone.getBaseRadius() + l);
        return surfaceArea;
    }

    public boolean detectCoordinatePlane(Cone cone){
        if (cone.getZ()==0){
            return true;
        }
        return false;
    }

    public double getVolume(Cone cone){
        double volume = cone.getX()/3 * Math.PI * cone.getBaseRadius() * cone.getBaseRadius();
        return volume;
    }

    public double getRatio(Cone cone){
        double ratio;
        if (cone.getZ() > 0){
            throw new UnsupportedOperationException();
        }
        else {
            double UpperPartHeight = Math.abs(cone.getHeight() - Math.abs(cone.getZ()));
            ratio = UpperPartHeight / Math.abs(cone.getZ());
        }

        return ratio;
    }
}
