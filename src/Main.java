//        Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
//        Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
//        Создайте переменную типа Student, которая ссылается на объект типа Aspirant.
//        Создайте метод getScholarship() для класса Student, который возвращает сумму стипендии.
//        Если средняя оценка студента равна 5 баллам, то сумма 100 р, иначе 80 р.
//        Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5 баллам, то сумма 200 р, иначе 180 р.
//        Создайте массив типа Student, содержащий объекты класса Student и Aspirant. Вызовите метод getScholarship() для каждого элемента массива.






public class Main {

    public static void main(String[] msi) {
        Student student = new Student("Sergey", "Shishkin", "bap1801", 4.5);
        Aspirant aspirant = new Aspirant("Nikita", "Belov", "isua", 4, "drone");
        Student un = new Aspirant("Andrey", "Eliseev", "bap1801", 5, "aboutSpace");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}

