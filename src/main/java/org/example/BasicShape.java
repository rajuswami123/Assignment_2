package org.example;

class BasicShape {
    String shapeName;
    float side;
    float side2;
    float side3;
    String s1 = "circle";
    String s2 = "rectangle";
    String s3 = "triangle";

    BasicShape(String shapeName, float side) {
        this.shapeName = shapeName;
        this.side = side;

    }

    BasicShape(String shapeName, float side2, float side3) {
        this.shapeName = shapeName;
        this.side2 = side2;
        this.side3 = side3;
    }

    BasicShape(String shapeName, float side, float side2, float side3) {
        this.side = side;
        this.shapeName = shapeName;
        this.side2 = side2;
        this.side3 = side3;

    }


    float peri() {
        if (shapeName.equals(s3)) {
            return side + side2 + side3;
        }
        if (shapeName.equals(s2)) {
            return 2 * (side2 + side3);
        }
        if (shapeName.equals(s1)) {
            return 2 * 3.14f * side;
        }
        return 0;


    }

    float area() {
        if (shapeName.equals(s3)) {
            return 0.5f * side2 * side3;
        }
        if (shapeName.equals(s1)) {
            return 3.14f * side * side;
        }
        if (shapeName.equals(s2)) {
            return side2 * side3;
        }

        return 0;
    }


}
