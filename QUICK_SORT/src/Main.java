/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    // Hàm sắp xếp Quick Sort

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Tìm chỉ số pivot sau khi phân mảng
            int pi = partition(arr, low, high);

            // Đệ quy sắp xếp mảng bên trái pivot
            quickSort(arr, low, pi - 1);

            // Đệ quy sắp xếp mảng bên phải pivot
            quickSort(arr, pi + 1, high);
        }
    }

    // Hàm phân chia mảng và chọn pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn phần tử cuối làm pivot
        int i = (low - 1); // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (arr[j] <= pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Hoán đổi arr[i+1] và pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Trả về vị trí của pivot
    }
}
