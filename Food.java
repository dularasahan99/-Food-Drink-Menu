package aiwa.entity;

public class Food {

	private int foodid;
	private String foodname;
	private int price;
	private String image;
	private String detail;

	public int getFoodId() {
		return foodid;
	}

	public void setFoodId(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodName() {
		return foodname;
	}

	public void setFoodName(String foodName) {
		this.foodname = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
