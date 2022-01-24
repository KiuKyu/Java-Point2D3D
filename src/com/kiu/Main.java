package com.kiu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println(point1);

        point1 = new Point2D(5.8f, 8.3f);
        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY()));

        Point3D point2 = new Point3D();
        System.out.println(point2);

        point2 = new Point3D(3.4f, 1.7f, 4.8f);
        System.out.println(point2);
        System.out.println(Arrays.toString(point2.getXYZ()));

    }
}
