import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counter {
    private List<File> list = new ArrayList<>();
    private int linenumber = 0;

    private FileReader fr = null;
    private BufferedReader br = null;

    public static void main(String args[]) {
        Counter lc = new Counter();
        lc.counter("E:\\IdeaProjects\\HappyFramework_2.0");
    }

    private void counter(String path) {
//        String path = System.getProperty("user.dir");
        System.out.println("Under " + path);
        File file = new File(path);
        File files[];
        files = file.listFiles();
        addFile(files);
        isDirectory(files);
        readLinePerFile();
        System.out.println("Total:" + linenumber + "lines");
    }

    private void isDirectory(File[] files) {
        for (File s : files) {
            if (s.isDirectory()) {
                File file[] = s.listFiles();
                addFile(file);
                isDirectory(file);

            }
        }
    }

    private void addFile(File file[]) {
        list.addAll(Arrays.asList(file));
    }

    private void readLinePerFile() {
        try {
            for (File s : list) {
                int yuan = linenumber;
                if (s.isDirectory()) {
                    continue;
                }
                if (s.getName().lastIndexOf(".java") <= 0) {
                    continue;
                }
                fr = new FileReader(s);
                br = new BufferedReader(fr);
                String i;
                while ((i = br.readLine()) != null) {
                    if (isBlankLine(i))
                        linenumber++;
                }

                System.out.printf("%-30s : %-20s lines\n", s.getName(), (linenumber - yuan));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                }
            }
        }
    }

    public boolean isBlankLine(String i) {
        if (i.trim().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}