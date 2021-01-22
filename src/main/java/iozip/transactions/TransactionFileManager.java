package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path path, List<Transaction> transactions) {
        try (ZipOutputStream os = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Transaction t : transactions) {
                os.putNextEntry(new ZipEntry(Long.toString(t.getId())));
                String out = t.getTime().toString() + "\n" + t.getAccount() + "\n" + Double.toString(t.getAmount());
                os.write(out.getBytes());
                os.closeEntry();
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write zip file.", ioe);
        }
    }
}
