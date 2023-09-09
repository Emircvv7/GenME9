public class Free {
        public static void main(String[] args) {
                int[] arr = { -7, -4, -2, 2, 3, 6, 8 };
                Free(arr);
        }

        public static void Free(int[] arr) {
                int n = arr.length;

                for (int i = 0; i < n - 1; i++) {
                        int minIndex = i;

                        for (int j = i + 1; j < n; j++) {
                                if (arr[j] < arr[minIndex]) {
                                        minIndex = j;
                                }
                        }
                        
                        int temp = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temp;

                        System.out.print("После итерации " + (i + 1) + ": ");
                        printArray(arr);
                }
        }

        public static void printArray(int[] arr) {
                for (int num : arr) {
                        System.out.print(num + " ");
                }
                System.out.println();
        }
}





