package mypkg.model;
import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {

		@Id
		@Column(name="addrid")
		private int addressId;
		@Column(name="place",length=20)
		private String place;
		
		@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
		@JoinColumn(name="stu_id",referencedColumnName="sid")
		private Student parent;

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public Student getParent() {
			return parent;
		}

		public void setParent(Student parent) {
			this.parent = parent;
		}

		@Override
		public String toString() {
			return "Address [addressId=" + addressId + ", place=" + place + ", parent=" + parent + "]";
		}
		
}
