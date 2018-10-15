package Figuer;

public class Circule extends Figure {
    class Circle extends Figure{
        public Circle(){

            lengthOfSide = 15;
            area = (Math.pow((lengthOfSide/(2 * P)), 2)) * P;
            System.out.println("Площадь круга с длинной окружности: " + lengthOfSide);
        }
    }
}
