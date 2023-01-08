public class Burger {
        //булочка, м'ясо, сир, зелень, майонез
        //Зробити три конструктори, які дозволятимуть робити бургери трьох видів:

    //з подвійним м'ясом
    //У кожен конструктор додати виведення в консоль складу даного варіанту бургера (при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися в консоль його склад).
    //Зробити клас BurgerMain, в якому створити три різні бургери. Їхній склад буде автоматично виводитися на екран під час запуску програми.
    public String bun;
    public  String meet;
    public String cheese;
    public  String green;
    public String mayonnaise;
    public int count;

    public Burger (String bun, String meet,String cheese, String green, String mayonnaise){
        this.bun = bun;
        this.meet = meet;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println("Для класичного бургеру потрібно: " + bun + ", " + meet + ", " + cheese + ", " + green + ", "+ mayonnaise + ".");
    }
    public Burger (String bun, String meet, String cheese, String green){
        this.bun = bun;
        this.meet = meet;
        this.cheese = cheese;
        this.green = green;
        System.out.println("Для дієтичного бургеру потрібно: " + bun + ", "+ meet + ", "+ cheese + ", "+ green+ ".");
    }
    public Burger (String bun,  String meet,int count, String cheese, String green, String mayonnaise){
        this.bun = bun;
        this.count=count;
        this.meet = meet;
        this.cheese =cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println("Для бургеру з подвійною порцією м'яса потрібно: " + bun + ", " + count +" порції " + meet + ", " + cheese + ", "+ green +", "+ mayonnaise +"." );

    }


    }





