/*
 
 
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Ritesh
 */
public class Wishlist {
    int wishlist_id;
    int user_id;
    int shop_product_id;

    public Wishlist(int user_id, int shop_product_id) {
        this.user_id = user_id;
        this.shop_product_id = shop_product_id;
    }

    public Wishlist() {
    }

    public int getWishlist_id() {
        return wishlist_id;
    }

    public void setWishlist_id(int wishlist_id) {
        this.wishlist_id = wishlist_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getShop_product_id() {
        return shop_product_id;
    }

    public void setShop_product_id(int shop_product_id) {
        this.shop_product_id = shop_product_id;
    }
 
}
