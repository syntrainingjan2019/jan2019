package mypkg.model;
import javax.persistence.*;

@Entity
@Table(name="vendor")
public class Vendor {
	
	@Id
	@Column(name="vid")
	private int vendorId;
	@Column(name="vName",length=30)
	private String vendorName;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	
}
