package Module02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String nome = "as";
        String pathDefault = "src/Module02/textFiles/";
        List<String> files = new ArrayList<>(
                List.of("assinaturas1.txt", "assinaturas2.txt", "autores.txt")
        );

        files.forEach(file -> {
            Thread thread =
                    new Thread(
                            new TaskSearchByText(nome, pathDefault + file),
                            "SearchByName"
                    );
            thread.start();
        });
    }
}
