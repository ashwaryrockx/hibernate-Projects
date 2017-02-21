package com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="personalAddress")
public class PersonalAddress  extends User
{
		
		@Column(name="address")
		private String address;
		@Column(name="streetNo")
		private int streetNo;
		@Column(name="nearBy")
		private String nearBy;
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getStreetNo() {
			return streetNo;
		}
		public void setStreetNo(int streetNo) {
			this.streetNo = streetNo;
		}
		public String getNearBy() {
			return nearBy;
		}
		public void setNearBy(String nearBy) {
			this.nearBy = nearBy;
		}
		
		
		
		
}
