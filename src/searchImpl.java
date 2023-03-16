

public class searchImpl implements search {
    public App app=new App();
    @Override
    public void search(App app) {
        System.out.println("余额为="+app.money1);
    }

}
