// Interface Food
interface Food {
    public String getType();
}

// Class Pizza implementing Food
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

// Class Cake implementing Food
class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

// Factory class FoodFactory
class FoodFactory {
    // Return an instance of Pizza or Cake based on the input parameter
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        return null;
    }
}

// Main class
class Solution {
    public static void main(String args[]) {
        // Create a new instance of the factory
        FoodFactory foodFactory = new FoodFactory();

        // Get an object of Pizza
        Food food1 = foodFactory.getFood("pizza");
        System.out.println("The factory returned " + food1.getClass().getName());
        System.out.println(food1.getType());

        // Get an object of Cake
        Food food2 = foodFactory.getFood("cake");
        System.out.println("The factory returned " + food2.getClass().getName());
        System.out.println(food2.getType());
    }
}
