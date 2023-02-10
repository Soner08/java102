public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player,"Güvenli Bölge");
    }
    @Override
    public boolean onLocation(){
        System.out.println("GÜVENLİ BÖLGEDESİNİZ");
        return true;
    }

}
