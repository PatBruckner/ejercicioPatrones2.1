package ejercicio2_1;



public class Client {
    public static void main (String [] arg) {
        Chat devChat = new Chat();

        Dev dev1 = new Dev(devChat);
        dev1.setName("dev1");
        dev1.setTo("dev2");
        Dev dev2 = new Dev(devChat);
        dev2.setName("dev2");
        Dev dev3 = new Dev(devChat);
        dev3.setName("dev3");

        devChat.addDev(dev1);
        devChat.addDev(dev2);
        devChat.addDev(dev3);

        dev1.send("hello DEV Team");
    }
}
