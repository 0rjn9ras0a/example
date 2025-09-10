public class StudentSort {
    public static void main(String[] args) {
        // Створюємо масив з іменами студентів
        String[] students = {
            "Петро",
            "Анна",
            "Марія",
            "Богдан",
            "Василь",
            "Ірина",
            "Дмитро"
        };

        System.out.println("Масив до сортування:");
        printArray(students);

        // Сортуємо масив
        java.util.Arrays.sort(students);

        System.out.println("\nМасив після сортування:");
        printArray(students);
    }

    // Метод для виведення масиву
    private static void printArray(String[] arr) {
        for (String student : arr) {
            System.out.println(student);
        }
    }
}
