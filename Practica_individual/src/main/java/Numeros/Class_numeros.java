/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numeros;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Class_numeros {
    private Integer numero;
    private Integer cant_dig;
    
    public void Numeros(){
    }
           
    
    public Integer getNumero() {
        return numero;
    }

    public Integer getCant_dig() {
        return cant_dig;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCant_dig(Integer cant_dig) {
        this.cant_dig = cant_dig;
    }

    @Override
    public String toString() {
        return "Class_numeros{" + "numero=" + numero + ", cant_dig=" + cant_dig + '}';
    }
    
    
    public void leerNum(){
        int a;
        Scanner rs=new Scanner(System.in);
        a=rs.nextInt();
        setNumero(a);
    }
    public void conteo_digitos(){
    Integer a=getNumero();
        String conto;
    int cont;
        conto=a.toString();
        cont=conto.length();
        /*int cont=0;
        do{
            a/=10;
            cont++;
        }while(a!=0);*/
    setCant_dig(cont);
        System.out.println(getCant_dig());
}
    
    
}
