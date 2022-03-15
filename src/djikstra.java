import java.util.ArrayList;
import java.util.List;

public class djikstra { 

    ArrayList<node> listenode= new ArrayList<node>();
    ArrayList<arrete> listeArretes = new ArrayList<arrete>();


    

    //creer node
    public void creerNode(int n){
            listenode.add(new node(n, Double.POSITIVE_INFINITY));
        }
    

    //trouver Node grâce à son numero
    public node getNodebynum(int n){
        for(int i=0;i<listenode.size();i++){
            if(listenode.get(i).num==n){
                return listenode.get(i);
            }
        }
        return null;
    }

    //initialiser les nodes 
    public void creerGraphe(int n){
        for(int i=1;i<=n;i++){
            creerNode(i);
            //System.out.println(getNodebynum(i).num);
        }
    }

    //Lister toutes les arrêtes existantes

    public void listerArretes(){
        for(int i=0;i<listenode.size();i++){
            for(int j=0;j<listenode.get(i).arretes.size();j++){
                listeArretes.add(listenode.get(i).arretes.get(j));
            }
        }
    }

    //Fonction cherchant arrete la distance la plus petite et retournant numero de sommet d'arrrivée

    /* public int mini(int d){
        double min = Double.POSITIVE_INFINITY;
        int numsommet=0;

        for(int i=0;i<getNodebynum(d).arretes.size();i++){
            if(getNodebynum(d).arretes.get(i).distance<min){
                min=getNodebynum(d).arretes.get(i).distance;
                numsommet=getNodebynum(d).arretes.get(i).fin.num;
            }
        }
        return numsommet;


    }
    */
    
    //Algorithme de Djikstra

    public void algo(int depart, int arrivee){


        List<Integer> ensemble1 = new ArrayList<Integer>();

        ensemble1.add(depart);
        getNodebynum(depart).distance_min=0;

        List<Integer> ensemble2 = new ArrayList<Integer>(); 

        for(int i=0;i<listenode.size();i++){
            if(listenode.get(i).num!=depart){
                ensemble2.add(listenode.get(i).num);
            }
        }
        
        //System.out.println(ensemble2);
        
        double min = Double.POSITIVE_INFINITY;
        int select = 0;

        /*    for(int i=0;i<ensemble1.size();i++){
                for(int j=0;j<getNodebynum(ensemble1.get(i)).arretes.size();j++){


                }


            }*/

           /* int i = 0;
            while(ensemble1.contains(listeArretes.get(i).debut.num) && ensemble2.contains(listeArretes.get(i).fin.num)){
                if(listeArretes.get(i).debut.distance_min + listeArretes.get(i).distance < listeArretes.get(i).fin.distance_min){
                listeArretes.get(i).fin.distance_min=listeArretes.get(i).debut.distance_min + listeArretes.get(i).distance;
                System.out.println(listeArretes.get(i).fin.num);
                System.out.println(listeArretes.get(i).fin.distance_min);
                }
            
                if(listeArretes.get(i).fin.distance_min<min){
                    min=listeArretes.get(i).fin.distance_min;
                    select = listeArretes.get(i).fin.num;
                }
                if(!ensemble1.contains(select)){
                ensemble1.add(select);
                ensemble2.remove(select);
                }
                i++;
            }
            */
        
            //while(!ensemble1.isEmpty()&&!ensemble2.isEmpty()){

            for(int i=0; i<listeArretes.size();i++){
                
                if(ensemble1.contains(listeArretes.get(i).debut.num) && ensemble2.contains(listeArretes.get(i).fin.num)){
                    if(listeArretes.get(i).debut.distance_min + listeArretes.get(i).distance < listeArretes.get(i).fin.distance_min){
                    listeArretes.get(i).fin.distance_min=listeArretes.get(i).debut.distance_min + listeArretes.get(i).distance;
                    System.out.println(listeArretes.get(i).fin.num);
                    System.out.println(listeArretes.get(i).fin.distance_min);
                    }
                }
                if(listeArretes.get(i).fin.distance_min<min){
                        min=listeArretes.get(i).fin.distance_min;
                        select = listeArretes.get(i).fin.num;
                }
                if(!ensemble1.contains(select)){
                    ensemble1.add(select);
                    ensemble2.remove(select);
                }
            
                
            
            }  

            /*for(int i=1;i<=listenode.size();i++){
                System.out.println(getNodebynum(i).distance_min);
            }
            */
        
        }
    

}

