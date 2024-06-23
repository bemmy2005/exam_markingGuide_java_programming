package Question_two;
	
    private List<Teacher> Teacher;
    private List<Student> Students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public Class  School() {
        Teacher = new ArrayList<>();
        Student = new ArrayList<>();
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public void addTeacher(Teacher teacher) {
        Teacher.add(teacher);
    }

    public void addStudent(Student student) {
        Student.add(student);
    }

    public List<Teacher> getTeacher() {
        return Teacher;
    }

    public List<Student> getStudents() {
        return Student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}
	//Butrus_wol
	//2309000416

