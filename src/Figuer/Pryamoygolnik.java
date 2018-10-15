package Figuer;

public class Pryamoygolnik extends Figure{
    public Pryamoygolnik() {
        numberOfSide = 4;
        lengthOfSide = 15;
        lengthOfSide = 3;
        area =(Math.pow(lengthOfSide,15))*(Math.pow(lengthOfSide,3));
        System.out.println("Площадь прямоугольника"+lengthOfSide);
    }
}
