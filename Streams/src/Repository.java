import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    Employee e1 = new Employee(101L, "Arun Kumar", "Software Engineer", "IT", 'A', true, 65000.00, 2);
    Employee e2 = new Employee(102L, "Priya Sharma", "Senior Software Engineer", "IT", 'B', true, 95000.00, 5);
    Employee e3 = new Employee(103L, "Rahul Verma", "Tech Lead", "Engineering", 'C', true, 140000.00, 8);
    Employee e4 = new Employee(104L, "Sneha Raj", "QA Engineer", "Testing", 'A', true, 60000.00, 3);
    Employee e5 = new Employee(105L, "Karthik S", "Backend Developer", "Engineering", 'B', true, 85000.00, 4);
    Employee e6 = new Employee(106L, "Divya Menon", "HR Executive", "HR", 'A', true, 55000.00, 2);
    Employee e7 = new Employee(107L, "Vijay Kumar", "DevOps Engineer", "Infrastructure", 'B', true, 105000.00, 6);
    Employee e8 = new Employee(108L, "Anjali Rao", "Project Manager", "Management", 'C', true, 150000.00, 10);
    Employee e9 = new Employee(109L, "Suresh Babu", "Software Engineer", "IT", 'A', false, 50000.00, 1);
    Employee e10 = new Employee(110L, "Meena Krishnan", "Business Analyst", "Finance", 'B', true, 90000.00, 5);

    Employee e11 = new Employee(111L, "Rohit Singh", "Frontend Developer", "Engineering", 'A', true, 70000.00, 3);
    Employee e12 = new Employee(112L, "Lakshmi Devi", "Data Analyst", "Analytics", 'B', true, 88000.00, 4);
    Employee e13 = new Employee(113L, "Manoj Kumar", "Software Architect", "Engineering", 'C', true, 180000.00, 12);
    Employee e14 = new Employee(114L, "Pooja Nair", "QA Lead", "Testing", 'B', true, 110000.00, 7);
    Employee e15 = new Employee(115L, "Ajay Raj", "Database Administrator", "IT", 'B', false, 75000.00, 6);
    Employee e16 = new Employee(116L, "Keerthi Anand", "UI/UX Designer", "Design", 'A', true, 65000.00, 3);
    Employee e17 = new Employee(117L, "Naveen Kumar", "Cloud Engineer", "Infrastructure", 'B', true, 115000.00, 5);
    Employee e18 = new Employee(118L, "Swetha R", "Product Manager", "Product", 'C', true, 160000.00, 9);
    Employee e19 = new Employee(119L, "Dinesh Kumar", "Support Engineer", "Support", 'A', false, 45000.00, 2);
    Employee e20 = new Employee(120L, "Harish V", "Java Developer", "Engineering", 'B', true, 90000.00, 4);

    List <Employee> employeesList = Arrays.asList(
            e1, e2, e3, e4, e5,
            e6, e7, e8, e9, e10,
            e11, e12, e13, e14, e15,
            e16, e17, e18, e19, e20
    );

    public List<Employee> employees() {
        return employeesList;
    }
}
