package com.epam.task.third.logic;

import com.epam.task.third.entities.Cone;
import com.epam.task.third.logic.ConeLogic;
import org.junit.Assert;
import org.junit.Test;

public class ConeLogicTest {

    private ConeLogic coneLogic = new ConeLogic();

    @Test
    public void testGetSurfaceArea(){
        //given
        Cone cone = new Cone (1,1,1,1,1);

        //when
        double actual = coneLogic.getSurfaceArea(cone);

        //then
        Assert.assertEquals(6.283, actual,0.001);
    }

    @Test
    public void testPlaneCheck(){
        //
        Cone cone = new Cone (1,1,1,1,1);
        //
        boolean actual = coneLogic.detectCoordinatePlane(cone);
        //
        Assert.assertEquals(false,actual);
    }

    @Test
    public void testGetVolume(){
        //
        Cone cone = new Cone (1,1,1,1,1);
        //
        double actual = coneLogic.getVolume(cone);
        //
        Assert.assertEquals(1.0472, actual, 0.001);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testVolumeRatioNoCollision(){
        //
        Cone cone = new Cone(0,0,2,1,1);
        //
        double actual = coneLogic.getRatio(cone);
        //
        Assert.assertEquals(0,actual,0.001);
    }

    @Test
    public void testVolumeRatioWhenCollidedWithPlain(){
        //
        Cone cone = new Cone(0,0,-2,1,5);
        //
        double actual = coneLogic.getRatio(cone);
        //
        Assert.assertEquals(1.5,actual,0.001);

    }
}
