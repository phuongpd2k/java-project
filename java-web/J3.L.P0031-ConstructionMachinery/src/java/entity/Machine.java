/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Zuy Fun
 */
public class Machine {

    int id;
    String name, shortDes, longDes, image, type;
    Date publishDate;

    public Machine() {
    }

    public Machine(int id, String name, String shortDes, String longDes, String image, String type, Date publishDate) {
        this.id = id;
        this.name = name;
        this.shortDes = shortDes;
        this.longDes = longDes;
        this.image = image;
        this.type = type;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", name=" + name + ", shortDes=" + shortDes + ", longDes=" + longDes + ", image=" + image + ", type=" + type + ", publishDate=" + publishDate + '}';
    }
    
}
