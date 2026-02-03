package dev.pichborith.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@ToString
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class User {
  String id;
  String name;
}
