import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        // Step 1: Create the URL for the CSV file
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            List<Double> temperatures = new ArrayList<>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

            String header = reader.readLine();
            System.out.println("Header: " + header);

            // Step 5: Process each data line
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");  // Split by semicolon

                if (columns.length > 1) {
                    String timestamp = columns[0].trim();
                    String temperatureStr = columns[1].trim();

                    try {
                        System.out.println("Timestamp: " + timestamp+ " temp: " + temperatureStr);

                        Date date = dateFormat.parse(timestamp);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);

                        if (calendar.get(Calendar.YEAR) == 2023 &&
                                calendar.get(Calendar.MONTH) == Calendar.JANUARY &&
                                calendar.get(Calendar.DAY_OF_MONTH) == 1) {

                            temperatures.add(Double.parseDouble(temperatureStr));
                            System.out.println("Gets here");
                        }
                    } catch (ParseException e) {
                        continue;
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }
            }
            if (!temperatures.isEmpty()) {
                double sum = 0;
                for (Double temp : temperatures) {
                    sum += temp;
                }
                double average = sum / temperatures.size();
                System.out.println("Average Temperature for 1st Jan 2023: " + average);
            } else {
                System.out.println("No data found for 1st Jan 2023.");
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
