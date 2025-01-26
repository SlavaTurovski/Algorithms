public class Main {
    public static void main(String[] args) {

        //поиск минимального значения в массиве

            int [] array = new int[] {100,22,34,5,26,45,90};

            int minValue = array[0];
            int minIndex = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i]< minValue){
                    minValue = array[i];
                    minIndex = i;
                }
            }

            System.out.println("minValue = " + minValue);
            System.out.println("minIndex = " + minIndex);

    }
}