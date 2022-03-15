public class App {
    public static void main(String[] args) throws Exception {

        djikstra d = new djikstra();

        //creer les sommets
        d.creerGraphe(8);

        
        //ajouter les arretes
        d.getNodebynum(1).ajoutArretes(d.getNodebynum(2), 1);
        d.getNodebynum(1).ajoutArretes(d.getNodebynum(8), 2);
        
        /*for(int i=0; i<d.getNodebynum(1).arretes.size();i++){
            System.out.println(d.getNodebynum(1).arretes.get(i).debut.num + d.getNodebynum(1).arretes.get(i).fin.num + d.getNodebynum(1).arretes.get(i).distance);
        }
       
        */
       
        
        d.getNodebynum(2).ajoutArretes(d.getNodebynum(1), 1);
        d.getNodebynum(2).ajoutArretes(d.getNodebynum(3), 1);
        d.getNodebynum(3).ajoutArretes(d.getNodebynum(2), 1);
        d.getNodebynum(3).ajoutArretes(d.getNodebynum(4), 1);
        d.getNodebynum(4).ajoutArretes(d.getNodebynum(3), 1);
        d.getNodebynum(4).ajoutArretes(d.getNodebynum(5), 1);
        d.getNodebynum(5).ajoutArretes(d.getNodebynum(4), 1);
        d.getNodebynum(5).ajoutArretes(d.getNodebynum(6), 1);
        d.getNodebynum(6).ajoutArretes(d.getNodebynum(5), 1);
        d.getNodebynum(6).ajoutArretes(d.getNodebynum(7), 1);
        d.getNodebynum(7).ajoutArretes(d.getNodebynum(6), 1);
        d.getNodebynum(7).ajoutArretes(d.getNodebynum(8), 1);
        d.getNodebynum(8).ajoutArretes(d.getNodebynum(7), 1);
        d.getNodebynum(8).ajoutArretes(d.getNodebynum(1), 2);

        
        /*for(int j=1; j<=d.listenode.size();j++){
            for(int i=0;i<d.getNodebynum(j).arretes.size();i++){
            d.listeArretes.add(d.getNodebynum(j).arretes.get(i));
            }
        }*/

       
       d.listerArretes();
         /*for(int i=0;i<d.listeArretes.size();i++){
            System.out.println(d.listeArretes.get(i).distance);
        }*/

        d.algo(1, 5);
        

    }
}
