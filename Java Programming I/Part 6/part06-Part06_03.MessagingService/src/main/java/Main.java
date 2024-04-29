
public class Main {

    public static void main(String[] args) {

        MessagingService ms = new MessagingService();
        Message message = new Message("hugo", "hi");
        ms.add(message);
        System.out.println(ms.getMessages());
    }
}
