package design;

public interface Employee {
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    // employeeId() will return employee id.

    int employeeId();
    public void setEmployeeId(int i);


    //employeeName() will return employee name
    void setEmployeeName(String name);
    public String employeeName();

    //assignDepartment() will assign employee to departments
  void assignDepartment();

    //calculate employee salary

    int calculateSalary();

    //employee benefit
    void benefitLayout();

    // employeeDOB() will return date of birth
    void employeeDOB();

    // employeeSSN() will return social security num
    void employeeSSN();

    //employeeIsWorkingFromHome() will return location of work place
    void employeeIsWorkingFromHome();

    // employeeExperience() will return employee experience
    void employeeExperience();



}
