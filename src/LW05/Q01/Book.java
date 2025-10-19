package LW05.Q01;
    public class Book extends BorrowableItems {
        private String title;
        private String author;
        private String ISBN;
        private boolean available;

        ////parameterized constructor
        public Book(String title, String author, String ISBN, boolean available) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.available = available;
        }

        //getter and setter methods
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        //implemented abstract method displayInfo()
        @Override
        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Availability: " + available);

        }
    }


