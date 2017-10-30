package application;

import scene.Scene;

import java.io.*;


/**
 * Singleton
 * The SceneLoader, saves and loads a scene
 */
public class SceneLoader implements Printable {

    private static SceneLoader instance = new SceneLoader();

    private SceneLoader() {
    }

    /**
     * Get the instance
     */
    public static SceneLoader getInstance() {
        return instance;
    }

    /**
     * Read the scene specified by path, relative to the project scene folder, ~/scenes
     *
     * @param path the path specifies what scene to load
     * @return The scene loaded from file, null if error occurs.
     */
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

    /**
     * Save the scene as the specifed name
     *
     * @param scene the scene to be saved
     * @param name  the filename to be used
     */
    public void save(Scene scene, String name) {
        print("Saving your scene, under __project_name__/scenes file folder");
        if (name.substring(name.length() - 6).equals(".scene")) {
            name += ".scene";
        }
        try {
            boolean flag = true;
            File current = new File("");
            File directory = new File(current.getCanonicalPath(), "scenes");

            if (!directory.exists()) {
                flag = directory.mkdirs();
            }
            File file = new File(directory, name + ".scene");
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
