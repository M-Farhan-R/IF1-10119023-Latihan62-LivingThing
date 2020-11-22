/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id> 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : 
 *
 */
public class IF110119023Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        
        human.setNama("Muhammad Farhan R");
        String nama = human.getNama();
        
        human.walk(nama);
        human.breath(nama);
        human.eat(nama);
    }

}
