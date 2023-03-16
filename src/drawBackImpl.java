

public class drawBackImpl implements drawBack {
    public App app=new App();
    @Override
    public void drawBack(App app) {
        app.money1 +=20;
        System.out.println("余额="+app.money1);
    }
}
