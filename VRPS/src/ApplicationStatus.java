import java.util.Scanner;

public class ApplicationStatus {
	
	public ApplicationStatus() {}
	public String status;
	public int rating;
	public String comments;
	
	
	/*public ApplicationStatus(String status, int rating, String comments) {
		super();
		this.status = status;
		this.rating = rating;
		this.comments = comments;
	}
*/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "ApplicationStatus [status=" + status + ", rating=" + rating + ", comments=" + comments + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationStatus applicationStatus=new ApplicationStatus();
	
		System.out.print(applicationStatus.status);
		System.out.print(applicationStatus.rating);
		System.out.print(applicationStatus.comments);
	}

}

