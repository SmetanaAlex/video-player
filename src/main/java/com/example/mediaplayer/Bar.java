package com.example.mediaplayer;

import com.example.mediaplayer.bottom.Play;
import com.example.mediaplayer.bottom.Time;
import com.example.mediaplayer.bottom.Volume;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;

public class Bar extends HBox {
  public Bar(MediaPlayer mediaPlayer) {
    setAlignment(Pos.CENTER);
    setPadding(new Insets(5, 10, 5, 10));
    getChildren()
        .addAll(new Play(mediaPlayer), new Time(mediaPlayer), new Volume(mediaPlayer));
    setStyle("-fx-background-color:#FFFFFF");
    HBox.setHgrow(getChildren().get(1), Priority.ALWAYS);
  }
}
