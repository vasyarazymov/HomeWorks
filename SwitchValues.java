/**
 * Created by Галя on 10.03.2017.
 */

    public class SwitchValues {
        public static void main(String[] args) {
            int first = 5;
            int second = 10;
        /*int temp = first;
        first = second;
        second = temp;*/

        /*Your implementation*/
            first = first + second;
            second = first - second;
            first = first - second;

            System.out.println("First = " + first + " , second = " + second);
        }
    }


