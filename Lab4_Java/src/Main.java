import java.util.*;
public class Main {
    public static void main(String[] args) {

        int exit = 1, n_sp, n_lt, n;
        Smartphone [] smartphone = new Smartphone[10];
        for (int i = 0; i < 10; i++)
        {
            smartphone[i] = new Smartphone("Model", 0, 0);
        }
        Laptop [] laptop = new Laptop[10];
        for (int i = 0; i < 10; i++)
        {
            laptop[i] = new Laptop("Model", 0, 0);
        }
        Devices devices = new Devices(smartphone, laptop);
        Creation creation = new Creation(0, 0);
        Company company = new Company("Brand", devices, creation);
        company.input();
        n_sp = company.getN_sp();
        n_lt = company.getN_sp();
        do {
            n = 0;
            System.out.println ("Выберите действие:\nПосчитать доход с продаж (1)\nПосчитать издержки компании (2)\nПосчитать прибыль компании (3)\nВывести все данные компании (4)\nУказать налоги (5)\nВывести данные о продуктах этой компании(6)\nВыход из программы (7)\n");
            Scanner inp = new Scanner(System.in);
            n = inp.nextInt();
            switch (n) {
                case 1:
                    System.out.printf("Доход с продаж = %f\n", company.income(n_sp, n_lt));
                    break;
                case 2:
                    System.out.printf("Издержки компании = %d\n", company.expenses());
                    break;
                case 3:
                    System.out.printf("Прибыль компании = %f\n", company.profit(n_sp, n_lt));
                    break;
                case 4:
                    company.output(n_sp, n_lt);
                    break;
                case 5:
                    creation.set_taxes();
                    break;
                case 6:
                    company.outputstr(n_sp, n_lt);
                    break;
                case 7:
                    exit = 0;
                    break;
                default:
                    break;
            }
        } while (exit == 1);
    }
}