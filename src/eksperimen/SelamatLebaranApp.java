package eksperimen;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SelamatLebaranApp extends Application {

    private ImageView masjidImage;
    private Label greetingLabel;

    @Override
    public void start(Stage stage) throws Exception {
        // Membuat sebuah pane baru
        Pane root = new Pane();

        // Membuat ImageView untuk menampilkan gambar masjid
        masjidImage = new ImageView();
        masjidImage.setFitWidth(200);
        masjidImage.setFitHeight(200);
        root.getChildren().add(masjidImage);

        // Membuat label untuk menampilkan ucapan selamat lebaran
        greetingLabel = new Label();
        greetingLabel.setStyle("-fx-font-size: 24px;");
        root.getChildren().add(greetingLabel);

        // Membuat sebuah button untuk memulai animasi
        Button startButton = new Button("Mulai Animasi");
        startButton.setOnAction(event -> startAnimation());
        startButton.setLayoutX(50);
        startButton.setLayoutY(250);
        root.getChildren().add(startButton);

        // Membuat sebuah scene baru dan menambahkan pane ke dalamnya
        Scene scene = new Scene(root, 400, 400);

        // Mengatur stage dengan scene dan menampilkan stage
        stage.setScene(scene);
        stage.show();
    }

    private void startAnimation() {
        // Memuat gambar masjid dari web online
        String imageUrl = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimg.freepik.com%2Ffree-vector%2Fmosque-design-white-background_1344-67.jpg%3Fw%3D2000&tbnid=f0mkKcIL9pru8M&vet=12ahUKEwjrprb6wLf-AhWF9nMBHZ_7C00QMygAegUIARC6AQ..i&imgrefurl=https%3A%2F%2Fwww.freepik.com%2Ffree-photos-vectors%2Fislamic-mosque&docid=3YotiKBxh2_WHM&w=2000&h=2000&q=gambar%20mosque&ved=2ahUKEwjrprb6wLf-AhWF9nMBHZ_7C00QMygAegUIARC6AQ";
        try {
            Image image = new Image(new URL(imageUrl).openStream());
            masjidImage.setImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mengatur label dengan ucapan selamat lebaran
        greetingLabel.setText("Selamat Lebaran!");

        // Membuat animasi menggunakan kelas AnimationTimer
        AnimationTimer animation = new AnimationTimer() {
            private double dx = 5;

            @Override
            public void handle(long now) {
                // Mengubah posisi gambar masjid secara horizontal
                double x = masjidImage.getX() + dx;
                if (x + masjidImage.getFitWidth() > masjidImage.getParent().getBoundsInLocal().getMaxX()
                        || x < masjidImage.getParent().getBoundsInLocal().getMinX()) {
                    dx = -dx;
                }
                masjidImage.setX(x);
            }
        };
        animation.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

