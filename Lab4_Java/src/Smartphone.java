import java.util.Scanner;
public class Smartphone {
    private String model_sp;
    private int quantity_sp;
    private int price_sp;

    public Smartphone(String model_sp, int quantity_sp, int price_sp)
    {
        this.model_sp = model_sp;
        this.quantity_sp = quantity_sp;
        this.price_sp = price_sp;
    }
    public Smartphone()
    {
        this.model_sp = "Model";
        this.quantity_sp = 0;
        this.price_sp = 0;
    }
    public void input_sp()
    {
        Scanner inp = new Scanner(System.in,"utf-8");
        System.out.printf("Введите модель смартфона ");
        this.model_sp = inp.next();
        System.out.printf("Введите число произведенных смартфонов ");
        this.quantity_sp = inp.nextInt();
        System.out.printf("Ввведите цену одного смартфона ");
        this.price_sp = inp.nextInt();
    }
    public void output_sp()
    {
        System.out.printf("Модель смартфона: %s\n", this.model_sp);
        System.out.printf("Число произведенных смарфонов = %d\n", this.quantity_sp);
        System.out.printf("Цена одного смартфона = %d\n", this.price_sp);
    }
    public String getstr_sp()
    {
        String smartphone;
        smartphone = model_sp + " " + Integer.toString(quantity_sp) + " " + Integer.toString(price_sp);
        return smartphone;
    }
    public int income_sp()
    {
        int income_sp = 0;
        income_sp = this.price_sp * this.quantity_sp;
        return income_sp;
    }
}
