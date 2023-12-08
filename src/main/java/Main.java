import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Do:\n1.AddUser;\n2.PayForCart\n3.Create singleton object\n4.Choose massage");
            int num = in.nextInt();
            switch(num){
                case(1):
                    System.out.println("Enter type admin or client or masseur (1/2/3): ");
                    int type = in.nextInt();
                    System.out.println("Enter UserName: ");
                    String name = in.next();
                    System.out.println("Enter UserEmail (...@gmail.com: ");
                    String email = in.next();
                    System.out.println("Enter Password: ");
                    String password = in.next();
                    String UserID = email + name.toCharArray();
                    Creator engineer = null;
                    if (type==1){
                        AdminUserBuilder builder = new AdminUserBuilder();
                        builder.UserName = name;
                        builder.UserEmail = email;
                        builder.UserID = UserID;
                        builder.Password = password;
                        engineer = new Creator(builder);
                        User user = engineer.createUser();
                        if (user != null) {
                            System.out.println("Below user created: ");
                            System.out.println("======================================================================");
                            System.out.println(user);
                            System.out.println("======================================================================");
                        }
                    }
                    else if (type==2){
                        ClientUserBuilder builder = new ClientUserBuilder();
                        builder.UserName = name;
                        builder.UserEmail = email;
                        builder.UserID = UserID;
                        builder.Password = password;
                        engineer = new Creator(builder);
                        User user = engineer.createUser();
                        if (user != null) {
                            System.out.println("Below user created: ");
                            System.out.println("======================================================================");
                            System.out.println(user);
                            System.out.println("======================================================================");
                        }
                    }
                    else if (type==3){
                        MasseurUserBuilder builder = new MasseurUserBuilder();
                        builder.UserName = name;
                        builder.UserEmail = email;
                        builder.UserID = UserID;
                        builder.Password = password;
                        engineer = new Creator(builder);
                        User user = engineer.createUser();
                        if (user != null) {
                            System.out.println("Below user created: ");
                            System.out.println("======================================================================");
                            System.out.println(user);
                            System.out.println("======================================================================");
                        }
                    }
                    else
                        System.out.println("Error type ");
                    break;
                case(2):
                    System.out.println("Enter type of payment for Group and OneCart: ");
                    String f = in.next();
                    String s = in.next();
                    Cart Group = new Group();
                    Cart oneCart = new OneCart();
                    Pay pay = new Pay();
                    pay.add(Group);
                    pay.pay(f);
                    pay.clear();
                    pay.add(oneCart);
                    pay.pay(s);
                    break;
                case(3):
                    Singleton singelton = Singleton.getInstance();
                    singelton.setUp();
                    break;
                case(4):
                    System.out.println("Enter type of massage (head/back/legs): ");
                    String mass = in.next();
                    Factory factory = new Factory();
                    Massage massage = factory.getCurrentMassage(mass);
                    massage.getMassage();
                    break;

            }


        }


    }

}