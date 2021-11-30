
package clases;


public class PreguntasFacil {
    
// Creamos un arreglo donde estan todas las preguntas separadas por una coma del nivel facil
    String[] preguntasfacil = {
      "Si tengo 3 manzanas y mi tía me regala 15 más. ¿cuántas manzanas tengo en total?",
      "El día de mi cumpleaños me regalaron plata, mi papá me regalo 30 pesos, mi mamá 30, mi hermano 8 y mi tío 22. ¿Cuánto reuní en total?",
      "Hay 25 duraznos, mi mamá se come 2, mi hermano se come 3, mi papá se come 3 y regala 10. ¿Cuántos duraznos quedan?",
      "¿Cuánto es la suma de 32 más 18?",
      "¿Cuál de las siguientes opciones corresponde a trescientos veinticinco?",
      "Alfredo recoge 7 dulces por cada casa que visita, ¿cuantos tendrá si visita 3 casas al final del día?",
      "María tiene 10 juguetes, la profesora la entrega 5 más y le dice que reparta de a un juguete a sus otros 12 compañeros. ¿Después de repartir los juguetes a sus compañeros, con cuantos queda María?",
      "¿Qué numero representa quinientos ochenta y ocho?"
    };
    
    //Creamos metodo para acceder a las preguntas por medio de un indice "posf"
    public String getPregunta(int posf){
        return preguntasfacil [posf];
    }
    
    //Nivel Medio
    
    // Creamos un arreglo donde estan todas las preguntas separadas por una coma
    String[] preguntasmedio = {
      "Cuál de las siguientes opciones da como resultado 24",
      "Elige otra forma de representar 3+3+3+3+3+3+3",
      "Si Pedro tiene 15 dulces y tiene que repartirlos a 3 amigos en partes iguales. ¿Cuántas dulces le corresponden a cada uno?",
      "¿Si una araña tiene 8 patas, cuantas patas hay en 5 arañas",
      "Se ha cortado un ponqué en 6 pedazos, si en  total hemos tenido 48 pedazos de ponqué. ¿Cuántos ponqués había en total?"  
    };
    
    //Creamos metodo para acceder a las preguntas por medio de un indice "posm"
    public String getPreguntaMedio(int posm){
        return preguntasmedio [posm];
    }
    
    //Nivel Dificil
    
    // Creamos un arreglo donde estan todas las preguntas separadas por una coma
    String[] preguntasdificil = {
      "Ana lee dos páginas por minuto, ¿cuantas páginas habrá leído en una hora?",
      "¿Cuál es el siguiente número de 24, 32, 40, 48, 56, 64, 72 …. ?",
      "Por cada hora caen 6 gotas de agua. ¿Cuántas gotas habrán caído en 2 días?",
      "Si un metro tiene 100 cm, y un kilómetro tiene 1000 metros. ¿Cuánto cm hay en 31 kilómetros?",
      "Pedro gana 8 pesos por cada patio que limpia. Si en el mes limpio 9 patios pero tuvo que pagar una renta de 20 pesos. ¿Cuánto dinero le quedo a pedro??"  
    };
    
    //Creamos metodo para acceder a las preguntas por medio de un indice "posm"
    public String getPreguntaDificil(int posd){
        return preguntasdificil [posd];
    }
}
