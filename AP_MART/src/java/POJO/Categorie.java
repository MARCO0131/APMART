/*
 
 
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Ritesh
 */
public class Categorie {
    
    int categories_id;
    String name;
    String image;

    public Categorie() {
    }

    public Categorie(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Categorie(int categories_id, String name, String image) {
        this.categories_id = categories_id;
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategories_id() {
        return categories_id;
    }

    public void setCategories_id(int categories_id) {
        this.categories_id = categories_id;
    }

}
