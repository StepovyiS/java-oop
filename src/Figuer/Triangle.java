package Figuer;

class Triangle extends Figure {
    public Triangle() {
        numberOfSide = 3;
        lengthOfSide = 5;
        area = ((Math.sqrt(3)) / 4) * Math.pow(lengthOfSide, 2);
        System.out.println("Площадь треугольника " + lengthOfSide);
    }

}

