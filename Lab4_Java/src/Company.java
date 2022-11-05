import java.util.Scanner;

public class Company {
    private String brand;
    private Devices devices;
    private Creation creation;
    private int n_sp = 0;
    private int n_lt = 0;
    public Company(String brand, Devices devices, Creation creation)
    {
        this.brand = brand;
        this.devices = devices;
        this.creation = creation;
    }
    public Company()
    {
        this.devices = new Devices();
        this.creation = new Creation();
        this.brand = "Brand";
    }
    public int getN_sp()
    {
        return n_sp;
    }
    public int getN_lp()
    {
        return n_lt;
    }
    public void input()
    {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Введите название компании ");
        brand = inp.next();
        System.out.printf("Введите число моделей смартфонов вашей компании ");
        n_sp = inp.nextInt();
        System.out.printf("Введите число моделей ноутбуков вашей компании ");
        n_lt = inp.nextInt();
        devices.input_dev(n_sp, n_lt);
        creation.input_creat();
    }
    public void output(int n_sp, int n_lt)
    {
        System.out.printf("Название компании: %s\n", brand);
        this.devices.output_dev(n_sp, n_lt);
        this.creation.output_creat();
    }
    public void outputstr(int n_sp, int n_lt)
    {
        devices.outstr_dev(n_sp, n_lt);
    }
    public float income(int n_sp, int n_lt)
    {
        float income, taxes;
        taxes = creation.get_taxes();
        income = (float)devices.income_dev(n_sp, n_lt) * (100 - taxes) / 100;
        return income;
    }
    public int expenses()
    {
        return creation.expenses_creat();
    }
    public float profit(int n_sp, int n_lt)
    {
        return income(n_sp, n_lt) - expenses();
    }
}
