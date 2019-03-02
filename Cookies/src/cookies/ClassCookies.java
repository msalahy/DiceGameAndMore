
package cookies;

public class ClassCookies {
    private int cookie;
    private int caloriePerCookie;

    public ClassCookies(int cookie) {
        this.cookie = cookie;
        this.caloriePerCookie = caloriePerCookie;
    }

    public void setCookie(int cookie) {
        this.cookie = cookie;
    }

    public int getCalorie(int cookie) {
        return cookie*75;
    }

    public void setCalorie(int caloriePerCookie) {
        this.caloriePerCookie = caloriePerCookie;
    }

    
    
}
