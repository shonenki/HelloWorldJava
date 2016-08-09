package helloworld;

public class testJava {
    //*** Defino variables globales ***
    //enteros
    int resSuma = 0, caso = 0;
    //strings
    String mensaje = "Hello World!";
    //arreglos
    Integer[] arreglo = new Integer[10];
    
    //constructor
    public testJava (){
        
    }
    
    //Todos los métodos que son llamados dentro de la misma clase se han definido como privados
    private void setSuma(int a, int b){
        //El resultado de la suma se almacena en la variable global resSuma.
        //Al utilizar el método void en setSuma el mismo no puede retornar nada.
        this.resSuma = a + b;
    }
    
    private int setResta(int a, int b){
        //Resta valores, para este ejemplo defino el método como int y no como void
        //Un método definido como void nunca debe retornar nada, por el contrario cualquier otro método
        //Por ejemplo el int (en este caso) debe retornar obligatoriamente el valor y por ende no uso una variable global
        int resta = a - b;
        return resta;
    }
    
    private String setDivide(int a, int b){
        //El residuo de una división se obtiene a través del operador %. La división es igual que en PHP /
        int residuo = a % b;
        int resultado = a / b;
        String division = "El residuo es: " + residuo + "\nEl resultado es: " + resultado;
        return division;
    }
    
    private void ifValida(){
         //Valida si la variable global resSuma no es igual a 3
         //Esto dependerá del resultado que se origien del método setSuma
        if(this.resSuma != 3){
            System.out.println("No es igual a 3");
        }
    }
    
    private void switchValida(int caso){
        //Ejemplo tradicional de switch case recibiendo un parámetro desde el llamado al método
        switch(caso){
            case 1:
                System.out.println("Ejecutando Caso #1");
                break;
            case 2:
                System.out.println("Ejecutando Caso #2");
                break;
            case 3:
                System.out.println("Ejecutando Caso #3");
                break;
        }
    }
    
    private void cicloWhile(){
        //arma la tabla del 9
        int contador = 0;
        do{
            //imprime resultados en un ciclo. ej: 9x2 = 18
            System.out.println("9" +"x"+ contador + " = " + (contador*9)); 
            contador++; //incrementa en 1 el contador
        }while(contador <= 10); //debe detener la ejecución cuando contador sea menor o igual a 10
    }
    
    private void cicloFor(){
        //arma un arreglo con 10 elementos del tipo int, todos random
        for(int j=0; j<10; j++){
            //devuelve un número random del 1 al 100 y lo asigna a la variable arreglo en el indice que j determine
            this.arreglo[j] = (int)(Math.random() *100+1);
        }
        //recorre e imprime el arreglo previamente creado
        for(int j=0; j<10; j++){
            System.out.println(this.arreglo[j]);
        }
    }
    
    //método público maestro (ejecuta los métodos privados de ejemplo)
    public void ejecutar(){
        //Llama al método de sumar y el resultado se obtiene a través de la variable global resSuma
        //El resultado se imprime en la línea 105
        setSuma(2,2);
        
        //Llama al método pero a diferencia este retorna el anterior como un entero
        int resta = setResta(5,3);
        
        //Idem al caso anterior, pero esta vez devuelve un string con el resultado
        String divide = setDivide(9,3);
        
        //Llama a diferentes métodos para ver su funcionamiento e imprime desde cada uno de ellos.
        ifValida();
        switchValida(2);
        cicloWhile();
        cicloFor();
        
        //Imprime salida de variables devueltas
        System.out.println(mensaje);
        System.out.println("El resultado de la suma es:" + this.resSuma);
        System.out.println("El valor retornado en resta es de: " +resta);
        System.out.println(divide);
    }
}
