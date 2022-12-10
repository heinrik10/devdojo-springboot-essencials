package academy.devdojo.springboot2.requests;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "The name of the anime cannot be null")
    @NotEmpty(message = "The name of the anime cannot be empty")
    private String name;
}
