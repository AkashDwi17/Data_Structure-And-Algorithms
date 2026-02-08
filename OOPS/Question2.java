package OOPS;

/*
 * ABSTRACT CLASS = ABSTRACTION
 * Defines WHAT an employee is
 * NOT what permissions they have
 */
abstract class Employee {

    // ENCAPSULATION
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters (controlled access)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*
     * Default behavior
     * Most employees cannot approve leaves
     */
    public void approveLeave() {
        throw new UnsupportedOperationException(
            "Leave approval not allowed for this role"
        );
    }

    /*
     * Default behavior
     * Only HR can terminate employees
     */
    public void terminateEmployee(Employee emp) {
        throw new UnsupportedOperationException(
            "Termination not allowed for this role"
        );
    }
}

/* ================= ROLES ================= */

class Manager extends Employee {

    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void approveLeave() {
        System.out.println("Manager approved the leave");
    }
}

class HR extends Employee {

    public HR(int id, String name) {
        super(id, name);
    }

    @Override
    public void approveLeave() {
        System.out.println("HR approved the leave");
    }

    @Override
    public void terminateEmployee(Employee emp) {
        System.out.println("HR terminated employee: " + emp.getName());
    }
}

class TeamLead extends Employee {

    public TeamLead(int id, String name) {
        super(id, name);
    }

    @Override
    public void approveLeave() {
        System.out.println("Team Lead approved the leave");
    }
}

class Intern extends Employee {

    public Intern(int id, String name) {
        super(id, name);
    }
    // Inherits restricted behavior
}

/* ================= SERVICE ================= */

/*
 * Service depends on ABSTRACTION (Employee)
 * NOT on concrete classes
 */
class EmployeeService {

    public void approveLeave(Employee employee) {
        employee.approveLeave(); // Polymorphism
    }

    public void terminate(Employee hr, Employee target) {
        hr.terminateEmployee(target);
    }
}

/* ================= MAIN ================= */

public class Question2 {

    public static void main(String[] args) {

        Employee manager = new Manager(1, "Amit");
        Employee hr = new HR(2, "Neha");
        Employee teamLead = new TeamLead(3, "Rahul");
        Employee intern = new Intern(4, "Ravi");

        EmployeeService service = new EmployeeService();

        // Leave approvals
        service.approveLeave(manager);    // ✅
        service.approveLeave(hr);         // ✅
        service.approveLeave(teamLead);   // ✅

        try {
            service.approveLeave(intern); // ❌
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Termination
        service.terminate(hr, intern);    // ✅

        try {
            service.terminate(manager, intern); // ❌
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
