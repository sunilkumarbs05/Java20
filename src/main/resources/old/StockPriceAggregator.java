import java.util.*;

public class StockPriceAggregator {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
		class Stock {
			String symbol;
			double price;
			public Stock(String symbol,double price) {
				this.symbol = symbol;
				this.price= price;
			}
			public String getSymbol() {
				return symbol;
			}
			public void setSymbol(String symbol) {
				this.symbol = symbol;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			
		}
		final Map<String,List<Stock>> map = new HashMap<>();
		@Override
		public void putNewPrice(String symbol, double price) {
			Stock  stock = new Stock(symbol, price);
			
			if(map.containsKey(symbol)) {
				map.get(symbol).add(stock);
			}else {
				List<Stock> list = new ArrayList<>();
				list.add(stock);
				map.put(symbol, list);
			}
		}

		@Override
		public double getAveragePrice(String symbol) {
			OptionalDouble d =map.get(symbol).stream().mapToDouble(stock->stock.getPrice()).average();
			return d.getAsDouble();
		}

		@Override
		public int getTickCount(String symbol) {
			long l =map.get(symbol).stream().count();
			
			return (int)l;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);

				stats.putNewPrice(symbol, price);

			}

			for (String symbol : symbols) {
				System.out.println(
						String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}