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

   public int employeeId();
    public void setEmployeeId(int i);


    //employeeName() will return employee name
    public void setEmployeeName(String name);
    public String employeeName();

    //assignDepartment() will assign employee to departments
   public void assignDepartment();

    //calculate employee salary
   public int calculateSalary();

    //employee benefit
    public void benefitLayout();

}
