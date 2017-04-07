package Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author "Alexis Jesus Sierra Martinez"
 */
public class Prestamo implements  Comparable <Prestamo>{
    private  int ISBN; 
    private  String titulo; 
    private String autor; 
    private int paxina; 
    
    public Prestamo(){
        
    }
    
public Prestamo(int isbn, String titulo,String autor,int pax){
    this.ISBN = isbn; 
    this.titulo = titulo; 
    this. autor  = autor; 
    this.paxina = pax; 
}


public int getISBN(){
    return ISBN; 
}
public String getTitulo(){
    return titulo; 
}


public  String getAutor(){
    return  autor; 
}
public int getPax(){
    return paxina; 
}

    @Override
    public int compareTo(Prestamo t) {
        
        if (this.getPax()<t.getPax()) {
            return -1;
        }
        else if (this.getPax()>t.getPax()) {
            return 1;
        }
        else {
            return 0;
        }
       
    }



}
