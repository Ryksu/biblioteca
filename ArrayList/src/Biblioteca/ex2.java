package Biblioteca;
import java.util.*; 

/**
 *
 * @author Alexis Jesus Sierra Martinez
 */
public class ex2 {
    
    public static void main(String[] args) {
        int opc = 0; 
        String titulo = " "; 
        String autor = " "; 
        int isbn, npax=0; 
        String text =" "; 
        int nbuscar; 
        Scanner sc = new Scanner(System.in); 
        
        ArrayList <Prestamo> Libroslist = new ArrayList<>(); 
        while(opc!=6){
            
            System.out.println("Escoge una opcion: ");
            System.out.println("1º Alta de libro");
            System.out.println("2º Baixa de libro");
            System.out.println("3º Modificar libro");
            System.out.println("4º Lista de libros por numeros de paxinas");
            System.out.println("5º Lista de libro de un autor");
            System.out.println("6º Salir");
            
            opc = sc.nextInt(); 
            switch(opc){
                case 1: 
                    sc.nextLine(); 
                    System.out.print("Escribe o titulo libro \n");
                        titulo = sc.nextLine(); 
                    System.out.print("Escribe o autor\n"); 
                        autor = sc.nextLine(); 
                    System.out.println("Escibe o numero de paxina");
                        npax = sc.nextInt(); 
                    System.out.print("Añadir o numero de ISBN\n");
                        isbn = sc.nextInt(); 
                        Libroslist.add((new Prestamo(isbn, titulo, autor, npax))); 
                        break; 
                
                case 2:
                            System.out.print("Escribe o ISBN\n");
                            nbuscar = sc.nextInt();
                             
                            for (int i = 0; i < Libroslist.size(); i++) {
                                if(Libroslist.get(i).getISBN() == nbuscar){
                                    System.out.println(Libroslist.get(i).getTitulo());
                                    System.out.println(Libroslist.get(i).getAutor());
                                        System.out.println("Es correcto: si/no");
                                        text = sc.next();
                                        
                                     if (text.equalsIgnoreCase("si")) {
                                        Libroslist.remove(i); 
                                        System.out.println("Libro Borrado"); 
                                    }
                                     else{
                                         System.out.println("abortado");
                                         
                                     }
           
                                }
                                else
                                    System.out.print("No se encuentra"); 
                                
                            }
                            break; 
                case 3: 
                        System.out.println("Escibe el ISBN");
                            nbuscar = sc.nextInt(); 
                            for (int i = 0; i < Libroslist.size(); i++) {
                                if (Libroslist.get(i).getISBN() == nbuscar) {
                                    System.out.println(Libroslist.get(i).getTitulo());
                                    System.out.print(Libroslist.get(i).getAutor());
                                    
                                    System.out.println("Es correcto si/no");
                                        text = sc.next(); 
                                        if (text.equalsIgnoreCase("si")) {
                                            Libroslist.remove(i); 
                                            System.out.print("Escribe el nuevo titulo");
                                                titulo = sc.nextLine(); 
                                            System.out.print("Escribe el nuevo Autor ");
                                                autor = sc.nextLine(); 
                                            System.out.println("Escibe el numero de pagina");
                                                npax = sc.nextInt(); 
                                            System.out.print("Añadir el numero de ISBN\n");
                                                isbn = sc.nextInt(); 
                                            Libroslist.add(new Prestamo(isbn, titulo, autor, npax)); 
                                    }
                                        else{
                                            System.out.println("abortado");
                                        }
                                            
                                }
                                else{
                                    System.out.println("No se encuentra");
                                }
                    }
                     break;
                case 4:
                    Collections.sort(Libroslist);
                    System.out.println("Lista de pagina ");
                        for (int i = 0; i < Libroslist.size(); i++) {
                            System.out.println(Libroslist.get(i).getTitulo() + ":  " + Libroslist.get(i).getPax());
                    }
                        break; 
                case 5:
                    System.out.println("Lista de autores");
                        for (int i = 0; i < Libroslist.size(); i++) {
                            System.out.println(Libroslist.get(i).getAutor());
                    }
            }
        }
    }

}
