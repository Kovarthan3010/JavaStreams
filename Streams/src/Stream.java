import java.util.List;

public class Stream {
    Repository repository = new Repository();
    List<Employee> employees = repository.employees();

    public void execute() {
//*
        //print even employee id's
       employees.stream()
                .map(Employee::getEmpId)
                .filter(empId -> empId %2 == 0)
                .forEach(System.out :: println);


       //conver string to lowercase
       employees.stream()
               .map(emp -> emp.getName())
               .map(String :: toLowerCase)
               .forEach(System.out :: println);

        //find max value
        double max = employees.stream()
                .map(Employee::getSalary)
                .max((a,b)->a.compareTo(b))
                .get();
        System.out.println(max);

        //find min value
        double min = employees.stream()
                .map(Employee :: getSalary)
                .min((a,b) -> a.compareTo(b))
                .get();
        System.out.println(min);

        //count names starting with A

        long count = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Count : "+count);
    }
}
