package com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="contact")
public class Contact  extends User
{
	
		@Column(name="mobileNo")
		private String mobileNo;
		@Column(name="landLineNo")
		private String landLineNo;
		@Column(name="emailId")
		private String emailId;
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getLandLineNo() {
			return landLineNo;
		}
		public void setLandLineNo(String landLineNo) {
			this.landLineNo = landLineNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
		
	
}
