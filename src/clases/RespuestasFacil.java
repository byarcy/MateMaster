
package clases;

import java.util.StringTokenizer;


public class RespuestasFacil {
    
// Nivel Facil
//Creamos un arreglo donde estaran las respuestas de cada pregunta
    String [] respuestasFacil = {
        "18 manzanas","90 pesos","7 Duraznos","50","325"
    };
    
    //Creamos un arreglo donde estaran todas las opciones de respuesta de cada pregunta
    String[] opcionesF = {
        "18 manzanas,17 manzanas,19 manzanas,20 manzanas",
        "80 pesos,90 pesos,91 pesos,99 pesos",
        "20 Duraznos,8 Duraznos,7 Duraznos,10 Duraznos",
        "50,55,52,51",
        "320,321,3255,325"
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
        "8x3","3x7","5 Dulces","40 Patas","8 Ponqués"
    };
    
    //Creamos un arreglo donde estaran todas las opciones de respuesta de cada pregunta
    String[] opcionesM = {
        "6x3,7x4,8x3,9x2",
        "3x5,3x6,3x7,3x8",
        "8 Dulces,4 Dulces,6 Dulces,5 Dulces",
        "40 Patas,42 Patas,43 Patas,44 Patas",
        "9 Ponqués,8 Ponqués,7 Ponqués,10 Ponqués"
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
    };
    
    //Creamos un arreglo donde estaran todas las opciones de respuesta de cada pregunta
    String[] opcionesD = {
        "110 Paginas,115 Paginas,120 Paginas,130 Paginas",
        "79,80,85,90",
        "300 Gotas,290 Gotas,288 Gotas,250 Gotas",
        "3100 cm,31000 cm,310000 cm,3100000 cm",
        "52 Pesos,60 Pesos,72 Pesos,20 Pesos"
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

