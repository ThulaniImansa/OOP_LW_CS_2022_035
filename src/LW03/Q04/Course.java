package LW03.Q04;


    public class Course {
        private String courseName;
        private String courseCode;
        private Lecturer lec;

//    public Course(String courseName, String courseCode) {
//        this.courseName = courseName;
//        this.courseCode = courseCode;
//    }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public Lecturer getLec() {
            return lec;
        }

        public void setLec(Lecturer lec) {
            this.lec = lec;
        }
    }

}
