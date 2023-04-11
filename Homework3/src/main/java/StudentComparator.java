import java.util.Comparator;

public class StudentComparator implements Comparator<Human> {

    @Override
    public int compare(Human human, Human anotherHuman) {
        if (human instanceof Student student && anotherHuman instanceof Student anotherStudent) {

            int result = anotherStudent.getAverage().compareTo(student.getAverage());

            if (result == 0) {
                result = anotherStudent.getLastName().length() - student.getLastName().length();
            }

            return result;
        } else {
            throw new IllegalArgumentException("Cannot compare different types of humans.");
        }
    }

}