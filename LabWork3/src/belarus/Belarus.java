package belarus;


    public class Belarus {
        public Districts districts;
       Languages languages;
       Neighbors neighbors;

        public String capital="Minsk";

        public String money="Belarusian rouble";

        public String foundationDate="19.09.1991";

        public String shortInfo(){
            Belarus belarus=new Belarus();
            //System.out.println("Official name: The Republic of belarus");
            //System.out.println("Capital:"+belarus.capital);
            return "The Republic of belarus"+" "+belarus.capital;

        }

        public String fullInfo(){
            Belarus belarus=new Belarus();
            return shortInfo()+" "+belarus.languages.rus+" "+belarus.languages.by+" "+belarus.languages.rus+" "+belarus.money+" "+belarus.districts.brest+" "+belarus.districts.gomel+" "+belarus.districts.grodno+" "+belarus.districts.minsk+" "+belarus.districts.mogilev+" "+belarus.districts.vitebsk+" "+belarus.neighbors.latvia+" "+belarus.neighbors.lithuania+" "+belarus.neighbors.ukraine+" "+belarus.neighbors.russia+" "+belarus.neighbors.poland;
            //System.out.println("Foundation Date:"+ belarus.foundationDate);
           // System.out.println("Official languages"+belarus.languages.by+" "+belarus.languages.rus);
            //System.out.println("Money:"+belarus.money);
           // System.out.println("Districts"+belarus.districts.brest+belarus.districts.gomel+belarus.districts.grodno+belarus.districts.minsk+belarus.districts.mogilev+belarus.districts.vitebsk);
            //System.out.println("Neighbors: "+belarus.neighbors.latvia+belarus.neighbors.lithuania+belarus.neighbors.ukraine+belarus.neighbors.russia+belarus.neighbors.poland);

        }



    }

