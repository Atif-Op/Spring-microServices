package comparable;

public class Employee implements java.lang.Comparable<Employee> {
    @Override
    public int compareTo(Employee emp) {
      return this.Id-emp.getId();
    }

    private int Id;
    private String Name;

    public Employee(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }

}
