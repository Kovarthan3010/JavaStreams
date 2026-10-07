public class Employee {

    private Long empId;
    private String name;
    private String role;
    private String department;
    private Character level;
    private boolean isPermanent;
    private double salary;

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int experience;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Long empId, String name, String role, String department, Character level, boolean isPermanent, double salary, int experience) {
        this.empId = empId;
        this.name = name;
        this.role = role;
        this.department = department;
        this.level = level;
        this.isPermanent = isPermanent;
        this.salary = salary;
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Character getLevel() {
        return level;
    }

    public void setLevel(Character level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
