import java.util.Scanner;

public class Game {
    private Scanner input= new Scanner(System.in);

    public void start (){
        System.out.println("Macera oyununa hoşgeldiniz !!!");
        System.out.print("İsim oluşturunuz:");
        String playerName = input. nextLine();
        Player player =new Player(playerName);
        System.out.println(player.getName() + " Hoşgeldiniz :)");
        System.out.println("Oyuna başlamak için karakterseçiniz: ");
        player.selectChar();
        Location location = null;
        while (true){


                System.out.print("Bölgeler :");
                System.out.print("1. Bölge Güvenli bölge");
                System.out.print("3. Bölge Mağara");
                System.out.print("4. Bölge dağ");
                System.out.print("Lütfen bölge seçiniz:");
                int selectLoc = input.nextInt();
                switch (selectLoc){
                    case 1:
                        location = new SafeHouse(player);
                        break;
                    case 2:
                        location =new ToolStore(player);
                        break;
                    case 3:
                        location=new Cave(player);
                        break;
                    case 4:
                        location=new Forest(player);
                        break;
                    default:
                        location = new SafeHouse(player);
                }


        if (!location.onLocation())
        {
            System.out.println("GAME OVER");
            break;

        }

        }
    }
}
