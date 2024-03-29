package proyecto.entities;

public class DetailedReport {
	int reportId;
	int reportType;
	String contact_phone;
	String reportTitle;
	String reportTimestamp;
	String reportAuthor;
	String reportBodyText;
	String answerBodyText;
	String adminName;
	String answerTimestamp;
	
	public DetailedReport(int reportId, int reportType, String contact_phone, String reportTitle,
			String reportTimestamp, String reportAuthor, String reportBodyText, String answerBodyText, String adminName,
			String answerTimestamp) {
		this.reportId = reportId;
		this.reportType = reportType;
		this.contact_phone = contact_phone;
		this.reportTitle = reportTitle;
		this.reportTimestamp = reportTimestamp;
		this.reportAuthor = reportAuthor;
		this.reportBodyText = reportBodyText;
		this.answerBodyText = answerBodyText;
		this.adminName = adminName;
		this.answerTimestamp = answerTimestamp;
	}

	public int getReportId() {
		return reportId;
	}

	public String getReportAuthor() {
		return reportAuthor;
	}

	public void setReportAuthor(String reportAuthor) {
		this.reportAuthor = reportAuthor;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public int getReportType() {
		return reportType;
	}

	public void setReportType(int reportType) {
		this.reportType = reportType;
	}

	public String getContact_phone() {
		return contact_phone;
	}

	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getReportTimestamp() {
		return reportTimestamp;
	}

	public void setReportTimestamp(String reportTimestamp) {
		this.reportTimestamp = reportTimestamp;
	}

	public String getReportBodyText() {
		return reportBodyText;
	}

	public void setReportBodyText(String reportBodyText) {
		this.reportBodyText = reportBodyText;
	}

	public String getAnswerBodyText() {
		return answerBodyText;
	}

	public void setAnswerBodyText(String answerBodyText) {
		this.answerBodyText = answerBodyText;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAnswerTimestamp() {
		return answerTimestamp;
	}

	public void setAnswerTimestamp(String answerTimestamp) {
		this.answerTimestamp = answerTimestamp;
	}
	
	
}
