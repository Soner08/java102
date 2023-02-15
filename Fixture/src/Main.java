import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> club = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Takım giriniz : ");
            System.out.println("*******************************");
            System.out.println("(Çıkmak için q'ya basınız)");
            String takım = scan.next();
            if (takım.equals("q")){
                break;
            }else {
                club.add(takım);
            }
        }

        if (club.size() % 2 == 1){
            club.add("Bay");
        }
        String[][] match = new String[ToplamMacSayisi(club.size())][2];
        int k = 0;
        for (int i = 0 ;i<club.size(); i++){
            for (int j = 0 ;j< club.size(); j++){
                if (i!=j){
                    match[k][0] = club.get(i);
                    match[k][1] = club.get(j);
                    k++;
                }
            }
        }
        Collections.shuffle(Arrays.asList(match));
        int round = 1;
        for (int i = 0 ; i<match.length;i++){
            if (i%4==0){
                System.out.println("Round " + round);
                round += 1;            }
            System.out.println(match[i][0] + "  vs  " + match[i][1]);
        }

    }
    public static int ToplamMacSayisi(int i){
        return i * (i-1);
    }
}