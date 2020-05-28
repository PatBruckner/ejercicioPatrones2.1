package ejercicio2_1;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Mediator{
    private List<Dev> DevList= new ArrayList<>();

    @Override
    public void send(String msg, Dev dev) {

        if(dev.getTo().equals("Everyone")){
            System.out.println(" <Chat Msg> ");

            for (int i = 0; i < DevList.size(); i++) {
                if (DevList.get(i).getName() != dev.getName())
                    DevList.get(i).messageReceived(msg);
            }
        }else{
            System.out.println(" <Chat Msg to:" +dev.getTo() + "> ");
            for (int i = 0; i < DevList.size(); i++) {
                if (DevList.get(i).getName().equals(dev.getTo()))
                    DevList.get(i).messageReceived(msg);
            }
        }

    }
    public void addDev(Dev dev){
        DevList.add((Dev) dev);
    }
}
