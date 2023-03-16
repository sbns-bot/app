public class changeImpl implements change{

    public App app=new App();
    @Override
    public void change(App app) {
        System.out.println(app.details);
    }
}
