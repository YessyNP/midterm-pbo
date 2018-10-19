/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author YESSYNP
 */
public class DiscountItem extends Item {
    private float discount;
    
    public DiscountItem(String nama, float price, int amount, float discount){
    super (nama, price, amount); // untuk mengisi konstruktor yang ada di class parent
    this.discount= discount; // untuk mengisi data ke variable discount
    }

    public float getDiscount() {
        return discount; // untuk mengembalikan nilai dari variabel diskon
    }

    public void setDiscount(float discount) {
        this.discount = discount; // untuk mengeset nilai atau memasukkan nilai ke variabel diskon
    }

    public String getNama() { 
        return nama; // Berfungsi mengembalikan nilai dari var nama
    }

    public void setNama(String nama) {
        this.nama = nama;   // berfungsi untuk menambahkan nilai pada var nama
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public float diskon(){
        return  (price*amount) -(price * amount * discount);
    }
    
    public float diskonItem(){
        return discount * 100;
    }
    
}