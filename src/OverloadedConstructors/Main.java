package OverloadedConstructors;

public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzarella");
        Pizza pizza3 = new Pizza("thicc crust", "tomato");
        Pizza pizza4 = new Pizza("thicc crust");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        System.out.println("Pizza without topping");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);

        System.out.println("Only bread and sauce, no cheese");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.topping);

        System.out.println("Pizza only with bread");
        System.out.println(pizza4.bread);
        System.out.println(pizza4.sauce);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.topping);


    }
}
