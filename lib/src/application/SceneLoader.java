package application;

import scene.Scene;

import java.io.*;

public class SceneLoader implements Printable {

    private static SceneLoader instance = new SceneLoader();

    private SceneLoader() {
    }

    public static SceneLoader getInstance() {
        return instance;
    }

    public Scene load(String path) {
        print("Reading...");
        Scene scene = null;
        try {
            File directory = new File("");
            File file = new File(directory.getCanonicalPath(), "scenes/" + path);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            scene = (Scene) objectInputStream.readObject();
            scene.refreshIndex();

        } catch (IOException e) {
            print("Load Failed, Check Your Files");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Load Failed, Class Not Found");
            e.printStackTrace();
        }
        return scene;
    }

    public void save(Scene scene) {
        print("Saving your scene, under __project_name__/scenes file folder");
        try {
            boolean flag = true;
            File current = new File("");
            File directory = new File(current.getCanonicalPath(), "scenes");

            if (!directory.exists()) {
                flag = directory.mkdirs();
            }
            File file = new File(directory, scene.getSceneName() + ".scene");
            if (!file.exists()) {
                flag &= file.createNewFile();
            }
            if (!flag) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(scene);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
