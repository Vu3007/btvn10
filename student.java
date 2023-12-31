public class student {
    private int id;
    private  String name;
    private int age;
    private String address;
    private int point;
    private String classroom;

    public student(int id,String name,int age,String address,int point,String classroom){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.point=point;
        this.classroom=classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" +address+
                ", point='"   +point +
                ", classroom='"  + classroom+'\'' +
                '}';
    }
}
