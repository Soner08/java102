public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "MAĞAZA");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya Hoşgeldin...");
        System.out.println("1-Silahlar");
        System.out.println("2-Zırhlar");
        System.out.println("3-ÇIKIŞ YAP");
        System.out.print("Seçiminiz: ");

        int selectCase=input.nextInt();
        while (selectCase < 1||selectCase > 3 ){
        System.out.println("Yanlış seçim. Tekrar giriniz:");
        selectCase=input.nextInt();

        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                return true;

        }
        return true;
        }
        public void printWeapon(){
        System.out.println("Silahlar..");
            for (Weapon w: Weapon.weapons()) {
                System.out.println(w.getName()+"PARA :" +w.getPrice());
                
            }


    }
    public void buyWeapon(){
        System.out.print("Lütfen silah seçiniz :");
        int selectWeaponID= input.nextInt();

        while (selectWeaponID < 1||selectWeaponID > Weapon.weapons().length){
            System.out.println("Yanlış seçim. Tekrar giriniz:");
            selectWeaponID=input.nextInt();
        }

        Weapon selectedWeapon =Weapon.getWeaponObjByID(selectWeaponID);
        if ( selectedWeapon!= null){
            if (selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                System.out.print("Yeterli paranız yok..");
            }else {
                System.out.print(selectedWeapon.getName()+"silahısatın aldınız.");
                int balance=this.getPlayer().getMoney()- selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız :"+this.getPlayer().getMoney());
                System.out.println("Önceki silahınız"+this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Şimdiki silahın->" +this.getPlayer().getInventory().getWeapon().getName());
            }

        }
    }
    public void printArmor(){
        System.out.println("....Zıhlar....");
        for (Armor a: Armor.armors()) {
            System.out.println(a.getName()+ "-"+a.getPrice());
    }
    }
    public void buyArmor(){
        System.out.print("Lütfen zırh seçiniz :");
        int selectArmorID= input.nextInt();

        while (selectArmorID < 1||selectArmorID> Armor.armors().length){
            System.out.println("Yanlış seçim. Tekrar giriniz:");
            selectArmorID=input.nextInt();

        }
        Armor selectedArmor=Armor.getArmorObjByID(selectArmorID);
        if (selectedArmor != null){
            if (selectedArmor.getPrice()>this.getPlayer().getMoney());
            System.out.print("Yeterli paranız yok..");
        }else {
            System.out.print(selectedArmor.getName()+"zırhını atın aldın.");
            int balance =this.getPlayer().getMoney()-selectedArmor.getPrice();
            this.getPlayer().setMoney(balance);
            this.getPlayer().getInventory().setArmor(selectedArmor);
            System.out.println("Bakiyeniz :"+getPlayer().getMoney());
        }
}
}