import java.util.ArrayList;

public class node {

    ArrayList<arrete> arretes = new ArrayList<arrete>();
    int num;
    double distance_min;

    public node(int n, double d){
        this.num=n;
        this.distance_min=d;
    }

    public void ajoutArretes(node n, int d){
        arretes.add(new arrete(this, n, d));
        
    }


}
