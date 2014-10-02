package stock;

import java.util.List;

public class StockData 
{
	private List<StockDataObserver> observers;
	private long time;
	private double price;
	
	public void registerObserver(StockDataObserver observer)
	{
		observers.add(observer);
	}
	
	public void removeObserver(StockDataObserver observer)
	{
		observers.remove(observer);
	}
	
	private void getData()
	{
		//make connection to server and get data back
		this.time = System.currentTimeMillis();
		this.price = Math.random();
	}
	
	public void updateObservers()
	{
		getData();
		for(StockDataObserver observer : observers)
		{
			observer.update(time, price);
		}
	}

}
