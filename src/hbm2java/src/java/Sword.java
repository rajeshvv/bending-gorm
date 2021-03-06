// default package
// Generated Feb 10, 2008 7:09:48 PM by Hibernate Tools 3.2.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Sword generated by hbm2java
 */
@Entity
@Table(name="sword_inventory"
)
public class Sword  implements java.io.Serializable {


     private long serialNumber;
     private Knight knight;
     private String manufacturer;

    public Sword() {
    }

	
    public Sword(long serialNumber, String manufacturer) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
    }
    public Sword(long serialNumber, Knight knight, String manufacturer) {
       this.serialNumber = serialNumber;
       this.knight = knight;
       this.manufacturer = manufacturer;
    }
   
     @Id 
    
    @Column(name="serial_number", nullable=false)
    public long getSerialNumber() {
        return this.serialNumber;
    }
    
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="assignee")
    public Knight getKnight() {
        return this.knight;
    }
    
    public void setKnight(Knight knight) {
        this.knight = knight;
    }
    
    @Column(name="manufacturer", nullable=false)
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }




}


