public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        checkCityRegister();
        checkWedding();
        checkChildren();
        checkStudent();
    }

    static void checkCityRegister() {
        System.out.println("City register is running");
    }

    static void checkWedding() {
        System.out.println("Wedding Запущен");
    }

    static void checkChildren() {
        System.out.println("Check children is running");
    }

    static void checkStudent() {
        System.out.println("Студенты проверяются");
    }
}

