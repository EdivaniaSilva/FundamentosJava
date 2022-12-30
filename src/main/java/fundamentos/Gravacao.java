package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void main (String[] args) throws IOException {
        String[] cabecalho = {"nome", "idade", "telefone"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Beatriz", "29", "11 999999999"});
        linhas.add(new String[]{"Edivania", "30", "14 988511674"});
        linhas.add(new String[]{"Filipe", "25", "14 971414482"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        escritorCSV.flush();
        escritorCSV.close();
        escritor.close();

    }
}
