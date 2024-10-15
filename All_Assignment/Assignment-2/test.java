import java.util.Arrays;

class Array {
    double[] double_arr;
    int size;

    Array(int t_size) {
        size = t_size;
        double_arr = new double[size];
    }

    void displayLength() {
        System.out.println("Array length is: " + size);
        if (size == 0) {
            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println("Index: " + i + " Value: " + double_arr[i]);
            }
        }
    }

    void displayForEach() {
        for (double key : double_arr) {
            System.out.println("Value: " + key);
        }
    }

    void sumOfSquares() {
        double sum = 0;
        for (double key : double_arr) {
            sum += (key * key);
        }
        System.out.println("Sum of square elements is: " + sum);
    }

    void meanAndMedian() {
        double mean = 0;
        double sum = 0;
        for (double key : double_arr) {
            sum += key;
        }
        mean = sum / size;
        System.out.println("Mean is: " + mean);

        // Calculate median
        double[] sortedArray = Arrays.copyOf(double_arr, size);
        Arrays.sort(sortedArray);
        double median;
        if (size % 2 == 1) {
            median = sortedArray[size / 2];
        } else {
            median = (sortedArray[(size / 2) - 1] + sortedArray[size / 2]) / 2.0;
        }
        System.out.println("Median is: " + median);
    }

    void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (double_arr[j] > double_arr[j + 1]) {
                    double temp = double_arr[j];
                    double_arr[j] = double_arr[j + 1];
                    double_arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted in ascending order (Bubble Sort): " + Arrays.toString(double_arr));
    }

    void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (double_arr[j] < double_arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = double_arr[minIndex];
            double_arr[minIndex] = double_arr[i];
            double_arr[i] = temp;
        }
        System.out.println("Array sorted in ascending order (Selection Sort): " + Arrays.toString(double_arr));
    }

    int searchElement(double value) {
        for (int i = 0; i < size; i++) {
            if (double_arr[i] == value) {
                return i; // Return index if found
            }
        }
        return -1; // Not found
    }

    double[] copyArray() {
        return Arrays.copyOf(double_arr, size);
    }

    void reverseArray() {
        for (int i = 0; i < size / 2; i++) {
            double temp = double_arr[i];
            double_arr[i] = double_arr[size - 1 - i];
            double_arr[size - 1 - i] = temp;
        }
        System.out.println("Array reversed: " + Arrays.toString(double_arr));
    }

    public static void main(String[] argv) {
        Array d1 = new Array(3);
        d1.double_arr[0] = 10;
        d1.double_arr[1] = 20;
        d1.double_arr[2] = 30;

        d1.displayLength();
        d1.displayForEach();
        d1.sumOfSquares();
        d1.meanAndMedian();

        d1.bubbleSort(); // Sort using bubble sort
        d1.reverseArray(); // Reverse the array

        d1.double_arr = new double[]{10, 20, 30}; // Reset the array for selection sort
        d1.selectionSort(); // Sort using selection sort

        double elementToSearch = 20;
        int index = d1.searchElement(elementToSearch);
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found.");
        }

        double[] copiedArray = d1.copyArray();
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
