package stock;

public class StockDataDisplay implements StockDataObserver 
{
	private StockData stockData;
	private long time;
	private double price;
	
	public StockDataDisplay(StockData data)
	{
		stockData = data;
		data.registerObserver(this);
	}

	public void unsubscribe()
	{
		stockData.removeObserver(this);
	}
	
	@Override
	public void update(long time, double price) 
	{
		this.time = time;
		this.price = price;
		display();
		
	}
	
	private void display()
	{
		
	}

}
