
package clases;

import java.util.StringTokenizer;


public class RespuestasFacil {
    
// Nivel Facil
//Creamos un arreglo donde estaran las respuestas de cada pregunta
    String [] respuestasFacil = {
        "18 manzanas","90 pesos","7 Duraznos","50","325",
        "21 Dulces","3 Juguetes","588","2 + 3 = 5","10 – 2",
        "7 ponqués","5+5+7+1","7 Años","3 Niños","4 Pesos"
            
    };
    
    //Creamos un arreglo donde estaran todas las opciones de respuesta de cada pregunta
    String[] opcionesF = {
        "18 manzanas,17 manzanas,19 manzanas,20 manzanas",
        "80 pesos,90 pesos,91 pesos,99 pesos",
        "20 Duraznos,8 Duraznos,7 Duraznos,10 Duraznos",
        "50,55,52,51",
        "320,321,3255,325",
        "22 Dulces,21 Dulces,20 Dulces,23 Dulces",
        "2 Juguetes,10 Juguetes,3 Juguetes,5 Juguetes",
        "588,5888,589,5899",
        "2 + 2 = 4,1 + 2 = 3,2 + 3 = 5,4 + 2 = 6",
        "8 ponqués,5 ponqués,6 ponqués,7 ponqués",
        "2+2+2,5+5+7+1,5+7+5+3,21-2-1-1",
        "8 Años,9 Años,10 Años,7 Años",
        "4 Niños,5 Niños,3 Niños,2 Niños",
        "5 Pesos,3 Pesos,4 Pesos,2 Pesos"
    };
    
    //Metodo para obtener las respuestas
    public String getRespuestasFacil(int posf){
        return respuestasFacil [posf];
    }
    
    public String[] separarf (String cadenaF, String separadorF){
        StringTokenizer token = new StringTokenizer(cadenaF, separadorF);
         
        String[] auxF = new String[4];
        int i=0;
        
        while (token.hasMoreTokens()){
            auxF[i] = token.nextToken();
            i++;
                    
        }
        return auxF;
    }
    
    public String[] setRespuestasFacil(int posf){
        String Cad = opcionesF[posf];
        String[] Sep = separarf (Cad,",");
        return Sep; 
    }
    
    
    //Nivel Medio
    
    //Creamos un arreglo donde estaran las respuestas de cada pregunta nivel medio
    String [] respuestasMedio = {
        "8x3","3x7","5 Dulces","40 Patas","8 Ponqués",
        "32 Patas","7x3","28x2","4 Perros","9x7",
        "24/3","Multiplicarlo por tres","5+5+5+5+5+5","5 Veces","27"
            
    };
    
    //Creamos un arreglo donde estaran todas las opciones de respuesta de cada pregunta
    String[] opcionesM = {
        "6x3,7x4,8x3,9x2",
        "3x5,3x6,3x7,3x8",
        "8 Dulces,4 Dulces,6 Dulces,5 Dulces",
        "40 Patas,42 Patas,43 Patas,44 Patas",
        "9 Ponqués,8 Ponqués,7 Ponqués,10 Ponqués",
        "30 Patas, 32 Patas,31 Patas,33 Patas",
        "5x4,20/1,10x2,7x3",
        "28x3,28x2,28x1,28x4",
        "4 Perros,5 Perros,3 Perros,6 Perros",
        "6x7,7x7,8x7,9x7",
        "24/2,24/3,24/6,24/4",
        "Multiplicarlo por dos,Multiplicarlo por tres,Dividirlo por tres,Sumarlo dos veces",
        "5+5+5+5+5,6+6+6+6,6+6+6+6+6+6,5+5+5+5+5+5",
        "4 Veces,3 Veces,5 Veces,6 Veces",
        "27,28,26,29"
    };
    
    //Metodo para obtener las respuestas
    public String getRespuestasMedio(int posm){
        return respuestasFacil [posm];
    }
    
    public String[] separarm (String cadenam, String separadorm){
        StringTokenizer token1 = new StringTokenizer(cadenam, separadorm);
         
        String[] auxm = new String[4];
        int i=0;
        
        while (token1.hasMoreTokens()){
            auxm[i] = token1.nextToken();
            i++;
                    
        }
        return auxm;
    }
    
    public String[] setRespuestasMedio(int posm){
        String Cadm = opcionesM[posm];
        String[] Sepm = separarm (Cadm,",");
        return Sepm; 
    }
    
    
    //Nivel Dificil
    
    //Creamos un arreglo donde estaran las respuestas de cada pregunta nivel dificil
    String [] respuestasDificil = {
        "120 Paginas","80","288 Gotas","3100000 cm","52 Pesos",
        "4 Dulces","88 Pesos","12 Kg","180 Pesos","180 Botellas",
        "32 Vacas","347 Minutos","30 Dulces","324 Pesos","2480 Pesos"
    };
    
    //Creamos un arreglo donde estaran todas las opciones de respuesta de cada pregunta
    String[] opcionesD = {
        "110 Paginas,115 Paginas,120 Paginas,130 Paginas",
        "79,80,85,90",
        "300 Gotas,290 Gotas,288 Gotas,250 Gotas",
        "3100 cm,31000 cm,310000 cm,3100000 cm",
        "52 Pesos,60 Pesos,72 Pesos,20 Pesos",
        "2 Dulces,3 Dulces,4 Dulces,5 Dulces",
        "85 Pesos, 86 Pesos,87 Pesos,88 Pesos",
        "10 Kg,11 Kg,12 Kg,13 Kg",
        "185 Pesos, 183 Pesos,180 Pesos,175 Pesos",
        "170 Botellas, 150 Botellas,180 Botellas,190 Botellas",
        "32 Vacas,35 Vacas,40 Vacas,42 Vacas",
        "500 Minutos, 452 Minutos,347 Minutos,505 Minutos",
        "20 Dulces, 33 Dulces,30 Dulces,40 Dulces",
        "324 Pesos, 320 Pesos,340 Pesos,323 Pesos",
        "548 Pesos,2500 Pesos,2480 Pesos,2400 Pesos"
    };
    
    //Metodo para obtener las respuestas
    public String getRespuestasDificil(int posd){
        return respuestasDificil [posd];
    }
    
    public String[] separard (String cadenad, String separadord){
        StringTokenizer token2 = new StringTokenizer(cadenad, separadord);
         
        String[] auxd = new String[4];
        int i=0;
        
        while (token2.hasMoreTokens()){
            auxd[i] = token2.nextToken();
            i++;
                    
        }
        return auxd;
    }
    
    public String[] setRespuestasDificil(int posd){
        String Cadd = opcionesD[posd];
        String[] Sepd = separard (Cadd,",");
        return Sepd; 
    }
            
}

