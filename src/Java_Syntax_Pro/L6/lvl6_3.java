package Java_Syntax_Pro.L6;

public class lvl6_3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        if (array[0] % 2 == 0){
            array[0] = array[0] *-1;
        }
        if (array[1] % 2 == 0){
            array[1] = array[1] *-1;
        }
        if (array[2] % 2 == 0){
            array[2] = array[2] *-1;
        }
        if (array[3] % 2 == 0){
            array[3] = array[3] *-1;
        }
        if (array[4] % 2 == 0){
            array[4] = array[4] *-1;
        }

        //напишите тут ваш код
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
/*
*
Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный, если значение этого элемента чётное.
Требования:
•	Реализуй метод main(String[]) согласно условию.
* */

/*
* for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                array[i]=-array[i];

            }
* */