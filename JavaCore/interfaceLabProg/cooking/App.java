package interfaceLabProg.cooking;

class App {
    public static void main(String[] args) {

        Chef c = new Chef();
        HomeCook h = new HomeCook();

        c.prepareIngredients();
        c.cook();
        c.serve();

        h.prepareIngredients();
        h.cook();
        h.serve();
    }
}