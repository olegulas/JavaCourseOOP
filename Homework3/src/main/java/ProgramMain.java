import java.util.ArrayList;
import java.util.List;

public class ProgramMain {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Федор", "Федоров");
        Teacher teacher2 = new Teacher("Сергей", "Смирнов");
        Teacher teacher3 = new Teacher("Иван", "Иванов");
        Teacher teacher4 = new Teacher("Степан", "Цветков");

        StudentGroup studentGroup01 = new StudentGroup("Группа1", 0, teacher1);
        StudentGroup studentGroup02 = new StudentGroup("Группа2", 1, teacher2);
        StudentGroup studentGroup03 = new StudentGroup("Группа3", 2, teacher3);
        StudentGroup studentGroup04 = new StudentGroup("Группа4", 3, teacher4);
        StudentGroup studentGroup05 = new StudentGroup("Группа5", 4, teacher4);
        StudentGroup studentGroup06 = new StudentGroup("Группа6", 5, teacher4);
        StudentGroup studentGroup07 = new StudentGroup("Группа7", 6, teacher3);

        List<Human> students = new ArrayList<>();
        students.add(new Student("Олег", "Олегов", 3));
        students.add(new Student("Мария", "Машечкина", 2));
        students.add(new Student("Михаил", "Бардов", 3));
        students.add(new Student("Константин", "Моргунов", 4));
        students.add(new Student("Ярослав", "Умнов", 5));
        students.add(new Student("Светлана", "Лаврентьева", 4));

        students.sort(new StudentComparator());
        HumanListIterator studentListIter = new HumanListIterator(students);
        while (studentListIter.hasNext()) {
            System.out.println(studentListIter.next());
        }

        List<Human> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        teachers.sort(new TeacherComparator());
        HumanListIterator teacherListIter = new HumanListIterator(teachers);
        while (teacherListIter.hasNext()) {
            System.out.println(teacherListIter.next());
        }
    }
}