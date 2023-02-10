import java.util.Scanner;

public class Player {
    private int damege;
    private int health;
    private int money;
    private String charName;
    private String name;
    private Inventory inventory;
    private Scanner input= new Scanner(System.in);
    public Player (String name){

        this.name=name;
        this.inventory=new Inventory();
    }

    public void selectChar(){

        GameChar[] charlist = {new Samurai(),new Kinght(),new Archer()};
        System.out.println("Karakterler...");

        System.out.println("************************************");
        for (GameChar gameChar : charlist) {
            System.out.println("ID:"+gameChar.getId()+
                    "\t Karakter:" +gameChar.getName()+
                    "\t Hasar :"+gameChar.getDamege() +
                    "\t Sağlık :"+ gameChar.getHealth()+
                    "\t Para = " +gameChar.getMoney());
            
        }
        System.out.println("***************************");
        System.out.print("Lütfen karakter seçiniz: ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Kinght());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.print("Karakter :" +this.getName()+
                " , Hasar :" +this.getDamege()+
                ", Sağlık :" +this.getHealth()+
                ", Para : " +this.getMoney());


    }

    public void initPlayer(GameChar gameChar){
        this.setDamege(gameChar.getDamege());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());

    }
    public void pirintInfo(){
        System.out.println(
                "Silah :"+getInventory().getWeapon().getName()+
                        "Zırh :"+getInventory().getArmor().getName()
        );

    }

    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        this.damege = damege;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
