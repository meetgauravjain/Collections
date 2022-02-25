package hash_map;

public class ArrangeIntNumbers {

  public static void main(String[] args) {
    int[] intArray = new int[]  {5, 3, -3, 10, 0, 2, -1, 4, -7, 2};
      intArray = arrangeNumbers(intArray);
      for ( int i = 0; i< intArray.length; i++) {
      System.out.print(" " + intArray[i]);
      }
  }
  public static int[] arrangeNumbers(int[] intArray) {
      for ( int x = 0; x< intArray.length; x++) {
      for ( int i = 0; i< intArray.length-1; i++) {
          int j = intArray[i];
          if (!(j >= 0)) {
              int k = (intArray[i+1]);
              if ((intArray[i+1] >= 0)) {
                  (intArray[i+1]) = j;
                  (intArray[i]) = k;
              }
          }
          else {
              int k = (intArray[i+1]);
              if ((intArray[i+1] < 0)) {
                  (intArray[i+1]) = k;
                  (intArray[i]) = j;
              }
            }
        }
      }
      return intArray;
  }
}
