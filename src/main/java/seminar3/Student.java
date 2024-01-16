package seminar3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Student implements Comparable<Student>{
    public Student(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    private String name;
        private List<Double> grades;
        private String specialty;

    public double getAverageGrade() {
        Stream<Double> st = grades.stream();
        Optional<Double> sum = st.reduce((a, b) -> a + b);
        return  sum.get()/grades.size();
    };

    @Override
    public int compareTo(Student o) {
        return this.getAverageGrade() > o.getAverageGrade()?-1:this.getAverageGrade() == o.getAverageGrade()?0:-1;
    }
}
