package design;

public abstract class AbstractEmployeeData implements Employee {
    int id;
    String name;
    String department;
    int hours;
    int daysOfWeek;
    int salary= hours+daysOfWeek;
    int dob;
    String benefit;
    boolean workSpace;
    int employeeYearsOfExperience;

    public AbstractEmployeeData(int id, String name, String department, int hours, int daysOfWeek, int salary, int dob, String benefit, boolean workSpace, int employeeYearsOfExperience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.daysOfWeek = daysOfWeek;
        this.salary = salary;
        this.dob = dob;
        this.benefit = benefit;
        this.workSpace = workSpace;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
    }

    protected AbstractEmployeeData() {
    }

    public int employeeId() {
        return id;


    }


    public String employeeName(String name) {
        return name;
    }

    public void assignDepartment( String department) {

    }


    public int calculateSalary(int salary) {
        return 0;
    }


    public void benefitLayout(String benefit) {

    }


    public void employeeDOB(int dob) {

    }


    public void employeeSSN(int ssn) {

    }

    public void employeeIsWorkingFromHome(boolean workSpace) {

    }


    public void employeeExperience(int employeeYearsOfExperience) {

    }

    public abstract void employeeNationality();

    public void employeeStartDate() {

    }
    public String employeeJobLevel(){
        return null;
    }

    }

