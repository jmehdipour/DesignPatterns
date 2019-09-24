package creational.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) {
        Employees employees1 = new Employees();
        employees1.loadData();

        Employees employees2 = (Employees) employees1.clone();
        List<String> empList2= employees2.getEmpList();
        empList2.add("Saeed");

        Employees employees3 = (Employees) employees1.clone();
        List<String> empList3 = employees3.getEmpList();
        empList3.add("Mohammad Hasan");

        System.out.println(employees1.getEmpList());
        System.out.println(employees2.getEmpList());
        System.out.println(employees3.getEmpList());


    }


}