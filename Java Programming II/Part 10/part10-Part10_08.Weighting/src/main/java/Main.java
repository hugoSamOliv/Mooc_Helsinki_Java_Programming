

public class Main {

    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase(40);
        suitcase.addItem(new Item("ok", 30));
        suitcase.addItem(new Item("oki", 10));
        suitcase.addItem(new Item("oke", 10));
        System.out.println(suitcase.totalWeight());
        suitcase.printItems();
        
        Suitcase suitcase2 = new Suitcase(40);
        suitcase2.addItem(new Item("ok", 10));
        suitcase2.addItem(new Item("oki", 10));
        suitcase2.addItem(new Item("oke", 10));
        System.out.println(suitcase.totalWeight());
        
        Hold hold = new Hold(100);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        
        System.out.println(hold.totalWeight());
        hold.printItems();
    }

}
