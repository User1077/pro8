package shortestPath;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BaseballFileReader {

    public ArrayList<Connection> readFile(String fileName) throws IOException {
        ArrayList<Connection> connections = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            String firstCity = data[0];
            String secondCity = data[1];
            int distance = Integer.parseInt(data[2]);
            connections.add(new Connection(firstCity, secondCity, distance));
        }

        reader.close();
        return connections;
    }
}
