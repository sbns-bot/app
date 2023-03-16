
import java.util.Scanner;

public class App {
    static searchImpl searchImpl = new searchImpl();
    static consumeImpl consumeImpl = new consumeImpl();
    static drawBackImpl drawBackImpl = new drawBackImpl();

    static changeImpl changeImpl = new changeImpl();

    static int money1 = 10000;//钱包余额
    static int money2 = 1000;//银行卡余额
    static String details = "余额";

    public static void main(String[] args) {

        String key = "";
        boolean loop = true;
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1余额");
            System.out.println("2消费");
            System.out.println("3退款");
            System.out.println("4明细");
            System.out.println("5退出");
            System.out.println("选择1-5");
            key = scanner.next();

            switch (key) {
                case "1":
                    searchImpl.search(app);
                    break;
                case "2":
                    consumeImpl.consume(app);
                    app.details += "\n消费余额\t" + app.money1;
                    break;
                case "3":
                    String choice = "";
                    System.out.println("输入1为转到钱包余额，输入2为转到银行卡余额");
                    while (true) {
                        choice = scanner.next();
                        if ("1".equals(choice)) {
                            drawBackImpl.drawBack(app);
                            app.details += "\n退款钱包余额\t" + app.money1;
                            break;
                        } else if ("2".equals(choice)) {
                            money2 += 20;
                            app.details += "\n退款银行卡余额\t" + app.money2;
                            System.out.println("银行卡余额=" + money2);
                            break;
                        }
                    }
                case "4":
                    changeImpl.change(app);
                    break;
                case "5":
                    System.out.println("退出");
                    loop = false;
                    break;
            }

        } while (loop);
        System.out.println("退出了");
    }
}
