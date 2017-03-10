
public class ClockAngel {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 30;
        int result = 0;

        /*Your code here*/

        result = (360/60) * mins - (360/12) * hours;

        /* 360/60 и 360/12 для нахождения градуировки для одной минуты и одного часа.
        Если часовая опережает минутную, то знак будет отрицательный,
         в математ. поставил бы модуль .*/


        System.out.println("Angle between hours and minute narrows is " + result);
    }
}
