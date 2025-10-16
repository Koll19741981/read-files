import java.nio.file.Files
import java.nio.file.Paths

def filePath = Pathes.get("example.txt")
def lines    = Files.readAlllines(filePath)

Lines.each {  line -> println line


}