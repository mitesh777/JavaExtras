
public class Car {
	private String model;
	private String company;
	private String colour;
	private boolean autoTransmission;
	private String type;
	private double price;
	
	//Setters and Getters
	public void setModel(String _model)
	{
		model=_model;
	}
	public String getModel()
	{
		return model;
	}
	public void setCompany(String _company)
	{
		company=_company;
	}
	public String getCompany()
	{
		return company;
	}
	public void setAutoTransmission(boolean _autoTransmission)
	{
		autoTransmission=_autoTransmission;
	}
	public boolean isAutoTransmission()
	{
		return autoTransmission;
	}
	public void setColour(String _colour)
	{
		colour=_colour;
	}
	public String getColour()
	{
		return colour;
	}
	public void setType(String _type)
	{
		type=_type;
	}
	public String getType()
	{
		return type;
	}
	public void setPrice(double _price)
	{
		price=_price;
	}
	public double getPrice()
	{
		return price;
	}
}
