import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import java.io.BufferedReader;

public class HadoopManager {
    private static HadoopManager instance=null;
    private FileSystem fs;
    private  BufferedReader br;

    public static HadoopManager getInstance(){
        if(instance==null){
            instance=new HadoopManager();
        }
        return instance;
    }
    private HadoopManager (){
        try {
            fs = FileSystem.get(new Configuration());
        }
        catch (Exception e){
            System.out.println("Errore");
        }
    }

    public boolean fileExists(String path){
        try {
            return fs.exists(new Path(path));
        }
        catch (Exception e){
            System.err.println("Errore");
            return false;
        }
    }

    public boolean appendRowInFile(String path, String row){
        FSDataOutputStream out=null;

        try {
            if (!fileExists(path)) {
                out = fs.create(new Path(path));
            } else {
                out = fs.append(new Path(path));
            }
            out.writeBytes(row);
            out.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
