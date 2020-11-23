package ua.academy.lgs;

public class Bike {
	private String modelName;
	private int productionYear;
	private int wheelDiameter;
	private String type;

	public Bike(String modelName, int productionYear, int wheelDiameter, String type) {

		this.modelName = modelName;
		this.productionYear = productionYear;
		this.wheelDiameter = wheelDiameter;
		this.type = type;
	}

	public Bike(String modelName, int productionYear) {

		this.modelName = modelName;
		this.productionYear = productionYear;
	}

	public Bike() {

	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getWheelDiameter() {
		return wheelDiameter;
	}

	public void setWheelDiameter(int wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + productionYear;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + wheelDiameter;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (productionYear != other.productionYear)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (wheelDiameter != other.wheelDiameter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bike [modelName=" + modelName + ", productionYear=" + productionYear + ", wheelDiameter="
				+ wheelDiameter + ", type=" + type + "]";
	}

	public void goOnTrip(Bike b, int distance) {
		System.out.println("You made " + distance + " km with your " + b + " on last trip");

	}

	public void goOnTrip(Bike b, String city, int distance) {
		System.out.println("You made " + distance + " km with your " + b + " on last trip to " + city);

	}

}
