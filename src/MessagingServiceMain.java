public class MessagingServiceMain {

        public static void main(String[] args) {

            MessagingService service = new MessagingService();

            Message msg1 = new Message("Hello!");
            Message msg2 = new Message("This is my second message.");

            Message msg3 = new Message("a".repeat(300));

            service.add(msg1);
            service.add(msg2);
            service.add(msg3);

            System.out.println("Messages in service:");

            for (Message message : service.getMessages()) {
                System.out.println(message.getContent());
            }
        }
    }

