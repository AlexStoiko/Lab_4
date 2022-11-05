import java.util.Scanner;
public class Laptop {
    private String model_lt;
    private int quantity_lt;
    private int price_lt;

    public Laptop(String model_lt, int quantity_lt, int price_lt)
    {
        this.model_lt = model_lt;
        this.quantity_lt = quantity_lt;
        this.price_lt = price_lt;
    }
    public Laptop()
    {
        this.model_lt = "Model";
        this.quantity_lt = 0;
        this.price_lt = 0;
    }
    public void input_lt()
    {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Введите модель ноутбука ");
        this.model_lt = inp.next();
        System.out.printf("Введите число произведенных ноутбуков ");
        this.quantity_lt = inp.nextInt();
        System.out.printf("Введите цену одного ноутбука ");
        this.price_lt = inp.nextInt();
    }
    public void output_lt()
    {
        System.out.printf("Модель ноутбука: %s\n", this.model_lt);
        System.out.printf("Число произведенных ноутбуков = %d\n", this.quantity_lt);
        System.out.printf("Цена одного ноутбука = %d\n", this.price_lt);
    }

    public String getstr_lt()
    {
        String laptop;
        laptop = model_lt + " " + Integer.toString(quantity_lt) + " " + Integer.toString(price_lt);
        return laptop;
    }
    public int income_lt()
    {
        int income_lt = 0;
        income_lt = this.price_lt * this.quantity_lt;
        return income_lt;
    }
}
