import java.util.ArrayList;
import java.util.List;

public class Arvud {
    static List<Integer> arvudListis =  new ArrayList<>();

    public Arvud(int arv1, int arv2, int arv3){
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(int arv){
        arvudListis.add(arv);
    }

    public static List<Double> libisevKeskmine(){
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < arvudListis.size()-2; i++) {
            double uusNumber = (arvudListis.get(i)+
                    arvudListis.get(i+1)+
                    arvudListis.get(i+1)+
                    arvudListis.get(i+2)
            )/3.0;
            doubles.add(uusNumber);
        }

        return doubles;
    }
}
