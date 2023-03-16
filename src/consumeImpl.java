
public class consumeImpl implements consume {

    public App app=new App();
    @Override
    public void consume(App app) {
        app.money1 -=100;
        System.out.println("余额="+app.money1);
    }
}
