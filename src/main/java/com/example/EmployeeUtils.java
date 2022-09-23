package com.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

  public String getFullName(Employee employee) {
    Function<Employee, String> fullName = employee1 -> employee1.getFirstName() + " " + employee1.getLastName();
    return fullName.apply(employee);
  }

  public String getManagersLastName(Employee employee) {
    Function<Employee, String> managersLastName = (Employee e1) -> e1.getManager().getLastName();
    return managersLastName.apply(employee);
  }

  public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
    Predicate<Employee> employedLongerThanFiveYears = (Employee e1) -> e1.getYearsOfService()>5;
    return employedLongerThanFiveYears.test(employee);
  }

  public boolean hasMoreThanThreeDirectReports(Employee employee) {
    Predicate<Employee> moreThanThreeDirectReports = (Employee e1) -> e1.getNumberOfDirectReports()>3;
    return moreThanThreeDirectReports.test(employee);
  }

  public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
    Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports
            = (Employee e1) -> e1.getYearsOfService()>3 && e1.getNumberOfDirectReports()<2;
    return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
  }
}
