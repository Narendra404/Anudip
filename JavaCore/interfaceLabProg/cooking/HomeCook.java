package interfaceLabProg.cooking;

class HomeCook implements Cooking {

    @Override
    public void prepareIngredients() {

        System.out.println();
        System.out.println("The Home Cook prepares fresh ingredients from the pantry.");
        System.out.println();
    }

    @Override
    public void cook() {

        System.out.println();
        System.out.println("The Home Cook cooks with common utensils.");
        System.out.println();
    }

    @Override
    public void serve() {

        System.out.println();
        System.out.println("The Home Cook serves the food to the family.");
        System.out.println();
    }
}