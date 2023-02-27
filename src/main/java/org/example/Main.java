package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger ou = Logger.getLogger("com.api.jar");
        Scanner in =new Scanner(System.in);
        float radi;
        float side;
        float side2 ;
        float side1;
        ou.info("1)Triangle\n2)Rectangle\n3)circle");
      ou.info("Enter the shapeName :");
        String name=in.next();
        ou.info("Enter the Dimensions : ");

        if(name.equals("circle")) {
            ou.info("Radius :");
            radi=in.nextFloat();


            BasicShape ob= new BasicShape(name,radi);
            ou.info("The perimetre of circle is :");
            ou.log(Level.INFO, () ->""+ ob.peri());
            ou.info("The  Area of Circle  is :");
            ou.log(Level.INFO, () ->""+ ob.area());

        }
        if(name.equals("triangle")){
            ou.info("Enter side 1:");
             side=in.nextFloat();
            ou.info("Enter side 2:");
             side1=in.nextFloat();
            ou.info(("Enter side 3:"));
             side2=in.nextFloat();
            BasicShape ob= new BasicShape(name,side,side1,side2);
            ou.info("The perimetre of Triangle is :");
            ou.log(Level.INFO, () ->""+ob.peri());
            ou.info("The area of triangle is :");
            ou.log(Level.INFO, () ->""+ ob.area());
        }

        if(name.equals("rectangle")){
            ou.info(("Enter length :"));
             side1=in.nextFloat();
            ou.info(("Enter  Breath :"));
            side2=in.nextFloat();
            BasicShape ob= new BasicShape(name,side1,side2);
            ou.info("The perimetre of Rectangle is :");
            ou.log(Level.INFO, () ->""+ob.peri());
            ou.info("The area of the Rectangle is :");
            ou.log(Level.INFO, () ->""+ ob.area());
        }
    }

}