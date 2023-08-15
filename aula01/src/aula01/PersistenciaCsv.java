package aula01;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersistenciaCsv {
	public static void main(String[] args) {
        List<String[]> data = List.of(
            new String[]{"Nome", "Idade", "Profissão"},
            new String[]{"João", "25", "Engenheiro"},
            new String[]{"Maria", "30", "Médica"},
            new String[]{"Carlos", "28", "Professor"}
        );

        String csvFilePath = "data.csv";

        try {
            FileWriter csvWriter = new FileWriter(csvFilePath);

            for (String[] rowData : data) {
                csvWriter.append(String.join(",", rowData));
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();

            System.out.println("Arquivo CSV criado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo CSV: " + e.getMessage());
        }
    }
}
