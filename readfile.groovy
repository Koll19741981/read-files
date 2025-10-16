import java.nio.file.Files
import java.nio.file.Paths

def filePath = Paths.get("server.csv")
def lines    = Files.readAllLines(filePath)

lines.each {  line -> println line


}