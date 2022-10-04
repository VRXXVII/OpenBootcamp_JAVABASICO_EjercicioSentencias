public class Sentencias {
    
    public static void main (String[] args){
      int numeroIf = -2;
      int numeroWhile = 0;
      var estacion = "OTOÑO";
      
      if (numeroIf == 0){
        System.out.println("es igual a 0");
      }
      else if (numeroIf >= 0){
        System.out.println("es mayor a 0");
      }
      else{
        System.out.println("es menor que 0");
      }


      while (numeroWhile < 3){
        System.out.println(numeroWhile);
        numeroWhile = numeroWhile + 1;
      }

      do {
        System.out.println(numeroWhile);
        numeroWhile = numeroWhile - 1;
      } while (numeroWhile > 3);

      for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
        System.out.println(numeroFor);

      }

      switch (estacion){
        case "OTOÑO":
        System.out.println("Estamos en otoño");
        break;
        case "INVIERNO":
        System.out.println("Estamos en invierno");
        break;
        case "PRIMAVERA":
        System.out.println("Estamos en primavera");
        break;
        case "VERANO":
        System.out.println("Estamos en verano");
        break;
        default:
        System.out.println("no es una estación");

      }





}
}