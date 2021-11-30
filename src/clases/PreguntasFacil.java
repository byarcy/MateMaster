
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
      "¿Qué numero representa quinientos ochenta y ocho?",
      "¿Cuál de las siguientes opciones es lo mismo que decir 3 + 2 = 5?",
      "Cuál de las siguientes opciones da como resultado 8?",
      "Milena se ha comido 2 ponqués y aún le quedan 5. ¿Cuántos ponqué tenia Milena?",
      "Cuál de las siguientes opciones de como resultado 18?",
      "Tengo 8 años y mi hermana tiene 15 años. ¿Cuántos años me lleva mi hermana?",
      "A mi fiesta de cumpleaños llegaron 22 niños de los cuales solo habían invitados 19. ¿Cuántos niños han llegado sin ser invitados?",
      "Antonio esta ahorrando para comprarse un avión de juguete que vale 33 pesos, si rompe su alcancía y tiene 29 pesos. ¿Cuánto le falta para comprase el avión?"
    };
    
    //Creamos metodo para acceder a las preguntas por medio de un indice "posf"
    public String getPregunta(int posf){
        return preguntasfacil [posf];
    }
    
    //Nivel Medio
    
    // Creamos un arreglo donde estan todas las preguntas separadas por una coma del nivel medio
    String[] preguntasmedio = {
      "Cuál de las siguientes opciones da como resultado 24",
      "Elige otra forma de representar 3+3+3+3+3+3+3",
      "Si Pedro tiene 15 dulces y tiene que repartirlos a 3 amigos en partes iguales. ¿Cuántas dulces le corresponden a cada uno?",
      "¿Si una araña tiene 8 patas, cuantas patas hay en 5 arañas",
      "Se ha cortado un ponqué en 6 pedazos, si en  total hemos tenido 48 pedazos de ponqué. ¿Cuántos ponqués había en total?",
      "¿Cuantas patas hay en 8 mesas?",
      "¿Cuál de las siguientes opciones No es igual a 20?",
      "¿Cuál de las siguientes opciones da como resultado cincuenta y seis?",
      "Carmen ha contado 16 patas de perros en el parque. ¿Cuántos perros conto en total?",
      "Otra forma de representar 7x9 es",
      "¿Cuál de las siguientes opciones da como resultado 8",
      "Que harías para obtener el triple de un numero",
      "Elige la opción que represente los mismo que 5x6",
      "La canción preferida de Paula dura 4 minutos, si la escucho por 20 minutos, ¿Cuántas veces la repitió?",
      "¿Cuál es el resultado de 3 x 9?",
    };
    
    //Creamos metodo para acceder a las preguntas por medio de un indice "posm"
    public String getPreguntaMedio(int posm){
        return preguntasmedio [posm];
    }
    
    //Nivel Dificil
    
    // Creamos un arreglo donde estan todas las preguntas separadas por una coma del nicel dificil
    String[] preguntasdificil = {
      "Ana lee dos páginas por minuto, ¿cuantas páginas habrá leído en una hora?",
      "¿Cuál es el siguiente número de 24, 32, 40, 48, 56, 64, 72 …. ?",
      "Por cada hora caen 6 gotas de agua. ¿Cuántas gotas habrán caído en 2 días?",
      "Si un metro tiene 100 cm, y un kilómetro tiene 1000 metros. ¿Cuánto cm hay en 31 kilómetros?",
      "Pedro gana 8 pesos por cada patio que limpia. Si en el mes limpio 9 patios pero tuvo que pagar una renta de 20 pesos. ¿Cuánto dinero le quedo a pedro??",
      "La mamá de Antonia repartió 48 dulces entre sus 4 hijos, después Antonia decide regalar sus dulces a sus tres amigos. ¿Cuántos dulces le toca a cada amigo de Antonia?",
      "Milena compro 5 esferos de 8 pesos cada uno, 3 cuadernos de 11 pesos y 3 marcadores de 5. ¿Cuánto dinero gasto en total?",
      "En un almacén hay 12 botellas de agua, cada una pesa 2 kg. Si al final del día quedan la mitad. ¿Cuantos kg quedan por vender?",
      "Carlos fue a la tienda hacer mercado, para eso llevo un billete de 50 pesos, 2 billetes de 20 pesos, 6 billetes de 10 pesos y 15 monedas de 2 pesos. ¿Cuánto dinero llevo en total?",
      "Una fábrica de gaseosas desea envasar su producción en botellas de 2 litros, si en su  primera bodega tiene 220 litros, en otra 120 litros en una tercera bodega 20 litros. ¿Cuántas botellas podrán llenar?",
      "Si una vaca come 6 kilos de pasto al día. ¿Cuantas vacas se pueden alimentar en 192 kilos de pasto?",
      "Un carpintero demora en hacer un avión de madera en 23 minutos, un carro de madera en 15 minutos y un caballo de madera en 1 hora. Si necesita hacer 4 aviones, cinco carros y 3 caballos ¿cuantos minutos demorara?",
      "Un maestro tiene 8 estudiantes y decide repartir dulces todos los días de la semana, los días lunes 40 dulces, los martes 16 dulces, los miércoles 64 dulces, los jueves 48 dulces y los viernes 72. ¿Cuántos dulces le tocaron a cada niño al finalizar la semana?",
      "Alfredo fue al centro comercial a comprar los regalos de navidad, para eso llevo un billete de 150 pesos, 4 billetes de 25 pesos, 8 billetes de 8 pesos y 5 monedas de 2 pesos. ¿Cuánto dinero llevo en total?",
      "Antuan es el vendedor de una tienda de mercado, si vende al día 80 pesos. ¿cuanto venderá en el mes de enero? ",
    };
    
    //Creamos metodo para acceder a las preguntas por medio de un indice "posm"
    public String getPreguntaDificil(int posd){
        return preguntasdificil [posd];
    }
}
