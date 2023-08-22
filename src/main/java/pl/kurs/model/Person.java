package pl.kurs.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor

@Getter

@ToString

@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;
    private List<String> hobbies;
    private List<Kid> kids;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate birthday;

    public boolean getIsMarried() {
        return isMarried;
    }
}
