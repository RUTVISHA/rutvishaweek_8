package Programme_26;

public class TestEncapsulation {
    public static void main(String[] args) {
 Encapsulate obj =new Encapsulate();
 obj.setName("Amit");
 obj.setAge(19);
 obj.setRollNo(51);

        System.out.println("Prime's Name:" +obj.getName());
        System.out.println("Prime's Age :" +obj.getAge());
        System.out.println("Prime's rollNo :" +obj.getRollNo());
    }
}
