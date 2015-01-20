package ejer1;

/**
 * 
 * @author raulpedraza
 */

import java.io.Serializable;

public class Tiempo implements Serializable {

	/**JAVA BEAN
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Attributes
	 */
	private int id;
	private String date;
	private float tempMin, temMax, humidity, pressure;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param date
	 * @param tempMin
	 * @param temMax
	 * @param humidity
	 * @param pressure
	 */
	public Tiempo(int id, String date, float tempMin, float temMax,
			float humidity, float pressure) {
		super();
		this.id = id;
		this.date = date;
		this.tempMin = tempMin;
		this.temMax = temMax;
		this.humidity = humidity;
		this.pressure = pressure;

		/**
		 * Getters and Setters
		 */
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getTempMin() {
		return tempMin;
	}

	public void setTempMin(float tempMin) {
		this.tempMin = tempMin;
	}

	public float getTemMax() {
		return temMax;
	}

	public void setTemMax(float temMax) {
		this.temMax = temMax;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	/**
	 * HasCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + Float.floatToIntBits(humidity);
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(pressure);
		result = prime * result + Float.floatToIntBits(temMax);
		result = prime * result + Float.floatToIntBits(tempMin);
		return result;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiempo other = (Tiempo) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Float.floatToIntBits(humidity) != Float
				.floatToIntBits(other.humidity))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(pressure) != Float
				.floatToIntBits(other.pressure))
			return false;
		if (Float.floatToIntBits(temMax) != Float.floatToIntBits(other.temMax))
			return false;
		if (Float.floatToIntBits(tempMin) != Float
				.floatToIntBits(other.tempMin))
			return false;
		return true;
	}

	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "Tiempo [id=" + id + ", date=" + date + ", tempMin=" + tempMin
				+ ", temMax=" + temMax + ", humidity=" + humidity
				+ ", pressure=" + pressure + "]";
	}

}
