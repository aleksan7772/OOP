package OOP;

/**
 * Сотрудник
 */
public class Employee extends Human {
    public String employmentDate; // дата приема на работу
    public int salary; // зарплата
    public Boolean presence; // присутствие

    public Employee(String employmentDate, int salary, Boolean presence) {
        this.employmentDate = employmentDate;
        this.salary = salary;
        this.presence = presence;
    }

    public static void cameToWork() {
        System.out.println("Сотрудники Пришли на работу");
    }
    public static void dinner() {
        System.out.println("Обеденный перерыв");
        System.out.println("Сотрудники пошли на обед");
    }
    public void working() {
        System.out.println("Работает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (employmentDate != null ? !employmentDate.equals(employee.employmentDate) : employee.employmentDate != null)
            return false;
        return presence != null ? presence.equals(employee.presence) : employee.presence == null;
    }

    @Override
    public int hashCode() {
        int result = employmentDate != null ? employmentDate.hashCode() : 0;
        result = 31 * result + salary;
        result = 31 * result + (presence != null ? presence.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employmentDate='" + employmentDate + '\'' +
                ", salary=" + salary +
                ", presence=" + presence +
                '}';
    }
}
