public class StudentComparision {
    public static void main(String[] args) {
        Student me = new Student("Umair Anwar", 20, 3.83);       
        // Student huzaifa = new Student("Huzaifa Saleh", 20, 3.5);
        Student huzaifa = new Student("Umair Anwar", 20, 3.83);

        System.err.println("Me == Huzaifa\t" + (me.equals(huzaifa)));
    }
    
}