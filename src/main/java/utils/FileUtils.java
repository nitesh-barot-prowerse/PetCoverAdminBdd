package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Collectors;

public class FileUtils {

    private static final Path TEMP_FILE_DIRECTORY = Paths.get(System.getProperty("user.dir"), "target", "temp").toAbsolutePath();

    public FileUtils() {

    }

    public static Properties loadPropertiesFromFile(String filePath) throws IOException {
        Properties props = new Properties();
        try {
            InputStream ioStream = getFileAsInputStream(filePath);
            Throwable var3 = null;
            try {
                props.load(ioStream);
            } catch (Throwable var14) {
                var3 = var14;
                throw var14;
            } finally {
                if (ioStream != null) {
                    if (var3 != null) {
                        try {
                            ioStream.close();
                        } catch (Throwable var13) {
                            var3.addSuppressed(var13);
                        }
                    } else {
                        ioStream.close();
                    }
                }
            }
            return props;
        } catch (FileNotFoundException var16) {
            throw var16;
        } catch (IOException var17) {
            throw new RuntimeException(var17);
        }
    }

    public static String loadFileAsString(String filePath) throws IOException {
        InputStream inputStream = getFileAsInputStream(filePath);
        StringBuilder responseStrBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            Throwable var4 = null;
            try {
                String inputStr;
                try {
                    while ((inputStr = bufferedReader.readLine()) != null) {
                        responseStrBuilder.append(inputStr + "\n");
                    }
                } catch (IOException var16) {
                    throw new RuntimeException(var16);
                }
            } catch (Throwable var17) {
                var4 = var17;
            } finally {
                if(bufferedReader != null) {
                    if (var4 != null){
                        try {
                            bufferedReader.close();
                        } catch (Throwable var15) {
                            var4.addSuppressed(var15);
                        }
                    } else {
                        bufferedReader.close();
                    }
                }
            }
        } catch (IOException var19) {
            throw new RuntimeException(var19);
        }

        return responseStrBuilder.toString();
    }

    public static String loadFileAsString(Path pathToFile) throws FileNotFoundException {
        if(!pathToFile.toFile().exists()) {
            throw new FileNotFoundException("File not found: " + pathToFile.toString());
        } else {
            try {
                return (String) Files.readAllLines(pathToFile).stream().collect(Collectors.joining("\n"));
            } catch (IOException var2) {
                throw new RuntimeException(var2);
            }
        }
    }

    public static Path createTemporaryFile(String fileName, String fileContents) {
        if(!TEMP_FILE_DIRECTORY.toFile().exists()) {
            TEMP_FILE_DIRECTORY.toFile().mkdir();
        }

        Path filePath = TEMP_FILE_DIRECTORY.resolve(fileName);

        try {
            Files.write(filePath,fileContents.getBytes(),new OpenOption[0]);
            return filePath;
        } catch (IOException var4) {
            throw new RuntimeException(var4);
        }
    }

    protected  static InputStream getFileAsInputStream(String filePath) throws FileNotFoundException {
        InputStream stream = FileUtils.class.getClassLoader().getResourceAsStream(filePath);
        if(stream == null) {
            throw new RuntimeException("file not found:" + filePath);
        } else {
            return stream;
        }
    }


}
