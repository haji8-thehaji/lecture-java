public class Subject {
	//...
	private List<Student> studentList;

	public void addStudent(Student student) {
		studentList.add(student);
	}
}

public class Student {
	//...
	private List<Subject> subjectList;

	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
}
