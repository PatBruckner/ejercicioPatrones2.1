package ejercicio2_1;



public class Dev {
    protected Mediator mediator;

    protected String name;

    protected String to;

    public Dev(Mediator mediator){
        this.mediator=mediator;
    }

    public String getTo(){return to;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTo(String to) {this.to = to;}

    public void send(String msg) {
        mediator.send("[msg send] "+" "+this.name+" : "+msg,this);
    }

    public void messageReceived(String msg) {
        System.out.println("[msg received] "+" "+this.name+" < "+msg);
    }
}
