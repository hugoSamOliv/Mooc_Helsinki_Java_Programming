
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double affordableMeal = 2.50;
        
        if (payment >= affordableMeal) {
            double change = payment - affordableMeal;
            this.money += affordableMeal;
            this.affordableMeals++;
            return change;
        }
        
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double heartyMeal = 4.30;
        
        if (payment >= heartyMeal) {
            double change = payment - heartyMeal;
            this.money += heartyMeal;
            this.heartyMeals++;
            return change;
        }
        
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        double affordableMeal = 2.50;
        
        if (card.balance() >= affordableMeal) {
            this.affordableMeals++;
            return card.takeMoney(affordableMeal);
        }
        
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        
        double heartyMeal = 4.30;
        
        if (card.balance() >= heartyMeal) {
            this.heartyMeals++;
            return card.takeMoney(heartyMeal);
        }
        
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {    
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
