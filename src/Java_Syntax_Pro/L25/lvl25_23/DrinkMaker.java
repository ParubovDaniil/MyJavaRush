package Java_Syntax_Pro.L25.lvl25_23;

public abstract class DrinkMaker {
    abstract void getRightCup(); // выбрать подходящую чашку;
    abstract void putIngredient(); // положить ингредиенты;
    abstract void pour();//  залить жидкость.
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }//который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкость.
}
