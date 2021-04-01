package tech.itpark.proggerhub.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Video {
    private String id;
    private String name;
    private String posterUrl;
    private String previewUrl;
    private int duration;
    private long created;
    private long views;
}
