
public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        float length = 0;
        float square = 0;

        /*your code here*/

        length = (float) (Math.sqrt( Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2)) + Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2)) + Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2)));
        square = (float)(Math.sqrt((length/2)*(length/2-Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)))*(length/2-Math.sqrt(Math.pow(x1-x3,2)+ Math.pow(y1-y3,2)))*(length/2-Math.sqrt(Math.pow(x2-x3,2)+ Math.pow(y2-y3,2)))));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
