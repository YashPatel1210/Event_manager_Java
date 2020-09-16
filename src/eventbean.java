
package eventmanager;

/**
 *
 * @author Yash Patel
 */
public class eventbean {
    
    private String name;
    private String date;
    private String venue;
    private String time;
    private float fees;
    private byte[] photo;
    
    eventbean( String name,String date,String time,String venue,float fees,byte[] photo){
        
        this.name=name;
        this.date=date;
        this.fees=fees;
        this.photo=photo;
        this.venue=venue;
        this.time=time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
