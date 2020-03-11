package q01;


import java.util.Scanner;



class Q01 {

   
    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
       System.out.println("Digite quantidade de tanques:");
       int tanques = ent.nextInt();
       
       int gasolina_total = 0, quilometros_total= 0;
       int gasosa, km;
       
       double consumo;
       
       for(int i = 0; i < tanques; i++){
           System.out.println("insira a quantidade de gasolina do tanque:");
           gasosa = ent.nextInt();
           System.out.println("insira a quantidade de quilometros dirigidos:");
           km = ent.nextInt();
           
           gasolina_total += gasosa;
           quilometros_total += km;
           
           consumo = km/gasosa;
           
           System.out.println(consumo);
    }
       
       System.out.println("o total de quilometros total foi:"+ quilometros_total);
       System.out.println("o total de galosina total foi:"+ gasolina_total);
     
}
    
}
