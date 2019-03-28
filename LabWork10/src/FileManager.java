import java.io.*;

public class FileManager {

    private File currentDirectory;

    public FileManager() {
        currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void executeCommand(String command, String name, String[] inputText) {
        switch (command) {
            case "cd":
                if (name != null) {
                    currentDirectory = new File(name);
                    System.out.println("Current directory:" + currentDirectory.getName());
                }
                break;
            case "cat":
                if (name != null) {
                    cat(name);
                }
                break;
            case "rm":
                if (name != null) {
                    deleteFile(name);
                }
                break;
            case "ls":
                ls(name);
                break;
            case "find":
                if (name != null) {
                    find(name);
                }
                break;
            case "mkdir":
                if (name != null) {
                    mkdir(name);
                }
                break;
            case "rmdir":
                if (name != null) {
                    deleteDirectory(name);
                }
                break;
            case "cp":
                cp(name);
                break;
            case "touch":
                createFileWithText(name,inputText);
                break;
            case "exit":
                System.exit(0);


        }
    }

    private void ls(String dirName) {
        if (dirName == null) {
            if (currentDirectory.isDirectory()) {
                for (File file : currentDirectory.listFiles()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            File dir = new File(dirName);
            if (dir.isDirectory()) {
                for (File file : dir.listFiles()) {
                    System.out.println(file.getName());
                }
            }
        }
    }

    private void cat(String fileName) {
        File file = new File(currentDirectory, fileName);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;

            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
    }

    private void deleteFile(String fileName) {
        File file = new File(currentDirectory, fileName);
        if (!file.isDirectory())
            file.delete();
        else System.out.println("Это папка");
    }

    private void deleteDirectory(String fileName) {
        File dir = new File(currentDirectory, fileName);
        if (dir.isDirectory())
            dir.delete();
        else System.out.println("Это не папка");
    }

    private void mkdir(String dirName) {
        File dir = new File(currentDirectory, dirName);

        if (dir.mkdir()) {
            System.out.println("Директория создана");
        } else System.out.println("Директория не создана");
    }

    private void find(String name) {
        int flag = 0;
        for (File file : currentDirectory.listFiles()) {
            if (file.getName().contains(name)) {
                System.out.println(file.getName());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Ничего не найдено");
        }
    }

    private void cp(String name) {
        File currentFile = new File(currentDirectory, name);
        File newFile = new File(currentDirectory, "COPY" + name);
        int i = 0, symbol;
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(currentFile)); BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newFile));) {
            while ((symbol = inputStream.read()) != -1) {
                System.out.println((char) symbol);
                outputStream.write(symbol);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createFileWithText(String fileName, String[] text) {
        File newFile = new File(currentDirectory, fileName);
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newFile));) {
            for (String str : text) {
                byte[] bytes = str.getBytes();
                outputStream.write(bytes, 0, bytes.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
