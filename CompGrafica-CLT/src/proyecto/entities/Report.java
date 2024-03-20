package proyecto.entities;

public class Report {
	private int id;
	private String timestamp;
	private int type;
	private String title;
	private String body;
	private String contactPhone;
	private int status;
	private int userID;
	
	public Report( int id, String timestamp, int type, String title, String body, String contactPhone, int status, int userId) {
		this.id = id;
		this.timestamp = timestamp;
		this.type = type;
		this.title = title;
		this.body = body;
		this.contactPhone = contactPhone;
		this.status = status;
		this.userID = userId;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getContactPhone() {
		return contactPhone;
	}
        
        public void setStatus(int status ) {
            this.status = status;
        }
        
        public int getStatus() {
            return status;
        }
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	
}
