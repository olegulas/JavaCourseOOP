import java.util.Comparator;

public class TeacherComparator implements Comparator<Human> {

    @Override
    public int compare(Human human, Human anotherHuman) {
        if (human instanceof Teacher teacher && anotherHuman instanceof Teacher anotherTeacher) {

            return Integer.compare(anotherTeacher.getStudentGroupSet().size(), teacher.getStudentGroupSet().size());
        } else {
            throw new IllegalArgumentException("Cannot compare different types of humans.");
        }
    }

}