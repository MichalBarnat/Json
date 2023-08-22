package pl.kurs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class SoundCloud {
    private String version;
    private String type;
    private String provider_name;
    private String provider_url;
    private int height;
    private String width;
    private String title;
    private String description;
    private String thumbnail_url;
    private String html;
    private String author_name;
    private String author_url;
}
