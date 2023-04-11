import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {

    @Override
    public int compare(Human human, Human anotherHuman) {
        int result;

        if (human instanceof Student student && anotherHuman instanceof Student anotherStudent) {

            result = anotherStudent.getAverage().compareTo(student.getAverage());

            if (result == 0) {
                result = anotherStudent.getLastName().length() - student.getLastName().length();
            }

            return result;
        } else if (human instanceof Teacher teacher && anotherHuman instanceof Teacher anotherTeacher) {

            return Integer.compare(anotherTeacher.getStudentGroupSet().size(), teacher.getStudentGroupSet().size());
        } else {
            throw new IllegalArgumentException("Cannot compare different types of humans.");
        }
    }

}