package LW03.Q04;

    public class Main {
        public static void main(String[] args) {
            Course course=new Course();
            Lecturer lecturer= new Lecturer();
            Student student=new Student();
            course.setCourseCode("ETEC 21862");
            course.setCourseName("Object Oriented Programming");
            course.setLec(lecturer);

            lecturer.setLecturerName("John Smith");
            lecturer.setCourseTeaching("Object Oriented Programming");
            student.setStudentName("Thulani");
            student.setCourseFollowing("OOP");
            student.setDegreeName("Computer Science");
            student.setCourseFollowing("OOP");
            System.out.println("Course Details");
            System.out.println("Course Name: "+course.getCourseName());
            System.out.println("Course Code: "+course.getCourseCode());
            System.out.println("Lecturer: " + course.getLec());
            System.out.println("Lecture Details");
            System.out.println("Name: "+lecturer.getLecturerName());
            System.out.println("Course: "+lecturer.getCourseTeaching());
            System.out.println("Student Details");
            System.out.println("Name: "+student.getStudentName());
            System.out.println("Degree: "+student.getDegreeName());
            System.out.println("Course: "+student.getCourseFollowing());

        }
    }



