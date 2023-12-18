package 作業七.test3;
import java.util.ArrayList;
import java.util.List;
public class Student {
    // 請將第二題中的Student類別增加String engName英文名字、String
    // studentId學號屬性，並於main中產生以下三個物件並加入List<Student>中:
    // Student("小明", "David", "001")
    // Student("小美", "Amy", "003")
    // Student("小華", "David", "002")
    // (a) 以list.forEach()印出"學號: studentId, 姓名: name, 英文名字: engName"
    // (b) 以list.sort()排序，先以英文名字由小到大排，再以學號由大到小排。排完後再以forEach印出結果
    // (c) 以list.stream().filter()找出學號大於等於002的學生。再以forEach印出結果
    // (d) 以list.stream().map()產生List<String> nameList的姓名串列。再以forEach印出結果。
    private String name;
    private String engName;
    private String studentId;
    public Student(String name, String engName, String studentId) {
        this.name = name;
        this.engName = engName;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getEngName() {
        return engName;
    }

    public String getStudentId() {
        return studentId;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("小明", "David", "001"));
        students.add(new Student("小美", "Amy", "003"));
        students.add(new Student("小華", "David", "002"));
        for (Student student : students) {
            System.out.print("學號:" + student.studentId + ",姓名:" + student.name + ",英文名字:" + student.engName + "\n");
        }
    }
}
