public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name      = name;
        this.salary    = salary;
        this.workHours = workHours;
        this.hireYear  = hireYear;
    }

    double tax() {
        if (salary < 1000) return 0;
        return salary * 0.03;
    }

    double bonus() {
        if (workHours <= 40) return 0;
        return (workHours - 40) * 30;
    }

    double raiseSalary() {
        int currentYear = 2021;
        int years = currentYear - hireYear;

        if (years < 10)       return salary * 0.05;
        else if (years < 20)  return salary * 0.10;
        else                  return salary * 0.15;
    }

    @Override
    public String toString() {
        double vergi      = tax();
        double bonusUcret = bonus();
        double zamMiktari = raiseSalary();
        double vergiBonusluMaas = salary - vergi + bonusUcret;
        double toplamMaas       = vergiBonusluMaas + zamMiktari;

        return "Adı : "           + name         + "\n" +
               "Maaşı : "         + salary        + "\n" +
               "Çalışma Saati : " + workHours     + "\n" +
               "Başlangıç Yılı : "+ hireYear      + "\n" +
               "Vergi : "         + vergi          + "\n" +
               "Bonus : "         + bonusUcret     + "\n" +
               "Maaş Artışı : "   + zamMiktari     + "\n" +
               "Vergi ve Bonuslar ile birlikte maaş : " + vergiBonusluMaas + "\n" +
               "Toplam Maaş : "   + toplamMaas;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(emp);
    }
}