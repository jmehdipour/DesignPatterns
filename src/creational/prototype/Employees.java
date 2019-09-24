package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Prototype {
    private List<String> empList;

    public Employees(){
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList){
        this.empList = empList;
    }

    public void loadData(){
        // for example load data from database 
        empList.add("Ilya");
        empList.add("Ava");
        empList.add("Benyamin");
        empList.add("Masomeh");
    }

    public List<String> getEmpList(){
        return empList;
    }


    @Override
    public Object clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }

} 