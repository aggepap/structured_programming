package gr.aueb.cf.ch6;

public class _06ArraySearch2 {
    public static void main(String[] args) {
int[] grades = {7, 2, 9, 10};
int grade = 10;
int position;

position = getPosition(grades,grade);
        System.out.printf("Position: %d , Grade: %d", position + 1, grades[position]);
    }

    /**
     *  Searches the array to find a specific value
     *  if the value is found it returns the index position of it.
     *  If it's not found it returns -1.
     *  Time complexity is linear 0(n).
     * @param arr
     * @param value
     * @return
     */
    public static int getPosition(int[] arr, int value){
int positionToReturn = -1;
for (int i = 0; i <arr.length; i++){
    if(arr[i] == value){
        positionToReturn = i;
        break;
    }
}
return positionToReturn;
    }
}
