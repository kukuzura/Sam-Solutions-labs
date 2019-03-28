public class Main {
    public static void main(String[] args) {
        FileManager manager = new FileManager();
        while (true) {
            System.out.println("Введите команду");
            Reader reader = new Reader();

            String[] words = reader.checkAndSplit();

            if (words != null) {
                if (words.length >= 2) {
                        String[] inputText = new String[words.length - 2];
                        for (int i = 0; i < words.length - 2; i++) {
                            inputText[i] = words[i + 2];
                        }
                    manager.executeCommand(words[0], words[1], inputText);

                }
                if (words.length == 1)
                    manager.executeCommand(words[0], null, null);

            }
        }
    }
}
