package seminar_3.SRP;

public class EmploeeSalaryCalculator {
private int baseSalary;
public EmploeeSalaryCalculator(int baseSalary) {
this.baseSalary = baseSalary;
}
public int calculateNetSalary() {
int tax = (int) (baseSalary * 0.25);//calculate in otherway
return baseSalary - tax;
}
}
