/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Zuy Fun
 */
public class Company {

    int id;
    String title, shortDes, longDes, image, address, city,
            country, tel, email;

    public Company() {
    }

    public Company(String title, String shortDes, String longDes, String image, String address, String city, String country, String tel, String email) {
        this.title = title;
        this.shortDes = shortDes;
        this.longDes = longDes;
        this.image = image;
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.email = email;
    }
    

    public Company(int id, String title, String shortDes, String longDes, String image, String address, String city, String country, String tel, String email) {
        this.id = id;
        this.title = title;
        this.shortDes = shortDes;
        this.longDes = longDes;
        this.image = image;
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    public String getLongDes() {
        return longDes;
    }

    public void setLongDes(String longDes) {
        this.longDes = longDes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", title=" + title + ", shortDes=" + shortDes + ", longDes=" + longDes + ", image=" + image + ", address=" + address + ", city=" + city + ", country=" + country + ", tel=" + tel + ", email=" + email + '}';
    }
    
}
