package interfaceLabProg.cooking;

class Chef implements Cooking {

    @Override
    public void prepareIngredients() {

        System.out.println();
        System.out.println("The Chef prepares the ingredients from stores of the hotel or restaurant.");
        System.out.println();
    }

    @Override
    public void cook() {

        System.out.println();
        System.out.println("The Chef cooks with specialized utensils.");
        System.out.println();
    }

    @Override
    public void serve() {

        System.out.println();
        System.out.println("The Chef serves the people who ordered the food.");
        System.out.println();
    }
}