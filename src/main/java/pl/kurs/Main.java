package pl.kurs;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import pl.kurs.model.DateKeeper;
import pl.kurs.model.Kid;
import pl.kurs.model.Person;
import pl.kurs.model.SoundCloud;
import pl.kurs.utils.ObjectMapperHolder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main {
    private static final String PATH = "src/main/resources/";

    @SneakyThrows
    public static void main(String[] args) {
        //  ObjectMapper mapper = new ObjectMapper();
        ObjectMapper mapper = ObjectMapperHolder.INSTANCE.getMapper();

        // deserializacja
        // utworzenie obiektu java na podstawie jsona
//        Person adamNowak = mapper.readValue(new File(PATH + "adamnowak.json"), Person.class);
//        System.out.println(adamNowak);

        // serializacja
        // zapisanie obiektu java do jsona

        Person janKowalski = new Person("Jan", "Kowalski", 50, false,
                List.of("pilka nozna", "koszykowka", "plywanie"),
                List.of(new Kid("Tomek", "Kowalski", 10), new Kid("Lukasz", "Kowalski", 60)),
                LocalDate.of(1995, 3, 14));

        mapper.writeValue(new File(PATH + "janKowalski.json"), janKowalski);

//        // zapisanie obiektu javowego do stringa z jsonem
//        Kid kid = new Kid("Franek", "Kwiakowski", 12);
//        String kidJsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(kid);
//        System.out.println(kidJsonString);
//
//        // stworzenie obietk ujava na podstawine stringa z jsonem
//        String kidJson = "{\"firstName\":\"Franek\",\"lastName\":\"Kwiakowski\",\"age\":12}";
//        Kid kidFromString = mapper.readValue(kidJson, Kid.class);
//        System.out.println(kidFromString);
//
//        // https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json
//        URL url = new URL(" https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json");
//        SoundCloud soundCloud = mapper.readValue(url, SoundCloud.class);
//        System.out.println(soundCloud);
//
//        DateKeeper dateKeeper = new DateKeeper(new Date());
//        mapper.writeValue(new File(PATH + "data.json"), dateKeeper);

        // serializersy + json nody

    }
}
