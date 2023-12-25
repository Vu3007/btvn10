import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<student>arrStudent=new ArrayList<>();
        student Student1=new student(1,"an",10,"b1",3,"c1");
        student Student2=new student(2,"bao",12,"b2",9,"c2");
        student Student3=new student(3,"trang",14,"b3",5,"c3");
        student Student4=new student(4,"dung",16,"b4",10,"c4");
        student Student5=new student(5,"loc",18,"b5",7,"c5");
       arrStudent.add(Student1);
        arrStudent.add(Student2);
        arrStudent.add(Student3);
        arrStudent.add(Student4);
        arrStudent.add(Student5);
        for (int i=0;i<arrStudent.size();i++){
            System.out.println(arrStudent.get(i));
        }

        //thêm học sinh mới
        Scanner sc=new Scanner(System.in);

        ArrayList<student>arrStudents=new ArrayList<>();
        for (int i=0;i<5;i++){
            System.out.println("Thêm id học sinh mới: ");
            int id= sc.nextInt();

            System.out.println("Thêm tên học sinh mới: ");
            String name= sc.nextLine();
            name= sc.nextLine();
            System.out.println("Thêm tuổi học sinh mới: ");
            int age=sc.nextInt();
            System.out.println("Thêm địa chỉ học sinh mới: ");
            String add=sc.nextLine();
            add=sc.nextLine();
            System.out.println("Thêm điểm học sinh mới: ");
            int point= sc.nextInt();
            System.out.println("Thêm lớp học sinh mới: ");
            String classroom=sc.nextLine();
            classroom=sc.nextLine();
            student Student6=new student(id,name,age,add,point,classroom);
            arrStudents.add(Student6);
            System.out.println(arrStudents.get(i));
            break;

        }

            ArrayList<String> list = new ArrayList<>();
            list.add(Student1.getName());
            list.add(Student2.getName());
            list.add(Student3.getName());
            list.add(Student4.getName());
        list.add(Student5.getName());



        //Sắp xếp theo điểm
        Collections.sort(arrStudent, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                //Sử dụng toán tử 3 ngôi
                return o1.getPoint() - o2.getPoint() > 0 ? 1 : -1;
            }
        });
        System.out.println("Danh sách sắp xếp theo điểm: ");
        show(arrStudent);
    }

    public static void show(ArrayList<student> list){
        for (student Student: list) {
            System.out.println(Student);
        }
    }
        }








