package student;

/**
 *
 * @author Phuong Thanh Nguyen
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("Y-i", 35, "male", 
                new Address("123", "35", "Main Street", "Tronto", "ON", "A1A 1A1"));
        
        System.out.println(stu1);
        
//        stu1.setAddress(new Address("123", "35", "Main Street", "Montreal", "QC", "B2B 2B2"));
        stu1.getAddress().setZipcode("B2B 2B2");
        
        stu1.checkDistance();
    }
}
