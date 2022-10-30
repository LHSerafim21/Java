package sistema_biblioteca;

import java.util.Date;
import java.util.ArrayList;

    public class Principal{

        public static void main(String[] args){

            Usuario u1 = new Professor(01, "Thomas", "125.156.298-42", "thomassera25@gmail.com", "Doutorado");
            Usuario u2 = new Professor(01, "Dante", "256.478.463-78", "dantehjdi6458@gmail.com", "Mestrado");
            Usuario u3 = new Aluno(02, "Nicolas", "587.968.128-45", "Nicoasafde56@gmail.com", "Computacao", 2020);
            Usuario u4 = new Aluno(02, "Klaus", "748.881.687-57", "Klausoisdya588@gmail.com", "Geografia", 2022);
            Usuario u5 = new AssistenteAdministrativo(03, "Noah", "766.751.697-13", "Nooahadsj145@gmail.com", null, null);
            Usuario u6 = new AssistenteAdministrativo(03, "Rafael", "756.235.425-98", "Rafathds5669@gmail.com", null, null);

            Livro l1 = new Livro(0001, false, "A revolta de Atlas", "Marco");
            Livro l2 = new Livro(0002, false, "Harry Potter e a pedra filosofal", "Tilibra");
            Livro l3 = new Livro(0003, false, "Duas Caras", "Marco");
            Livro l4 = new Livro(0004, true, "Memorias postumas de bras cubas", "Tilibra");
            Notebook n1 = new Notebook(2556, false, "GalaxyBook", "Samsung", "IntelCoreI5");
            Notebook n2 = new Notebook(3564, false, "Inspiron", "Dell", "IntelCoreI7");
            Notebook n3 = new Notebook(9657, false, "LgGram", "Lg", "IntelCoreI3");
            Notebook n4 = new Notebook(2547, false, "MacBook", "Apple", "IntelCoreI9");
            
            ArrayList<Item> item = new ArrayList();
            ArrayList<Usuario> usuario = new ArrayList();
            ArrayList<Emprestimo> emprestimo = new ArrayList();

            emprestimo.usuario
        }
    }
