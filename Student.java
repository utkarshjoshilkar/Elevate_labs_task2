class Student {
    private int student_id;
    private String student_name;
    private Float marks;


    public Student(int student_id, String student_name, Float marks) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.marks = marks;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return this.student_id == other.student_id;
    }

    public void ViewStudent() {
        System.out.println("Name : "+ this.student_name + " Id : "+ this.student_id + " Marks : " + this.marks);
    }

    public void editMarks(float marks) {
        this.marks=marks;
    }

}

