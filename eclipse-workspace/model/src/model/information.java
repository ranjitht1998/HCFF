package model;

public class information {
		private int AadharNo;
		private int PanNo;
		private String MailId;
		
		public information() {};

		public information(int aadharNo, int panNo, String mailId) {
			super();
			AadharNo = aadharNo;
			PanNo = panNo;
			MailId = mailId;
		}

		public int getAadharNo() {
			return AadharNo;
		}

		public void setAadharNo(int aadharNo) {
			AadharNo = aadharNo;
		}

		public int getPanNo() {
			return PanNo;
		}

		public void setPanNo(int panNo) {
			PanNo = panNo;
		}

		public String getMailId() {
			return MailId;
		}

		public void setMailId(String mailId) {
			MailId = mailId;
		};

		
		
}
