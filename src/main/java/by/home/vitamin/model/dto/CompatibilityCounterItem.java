package by.home.vitamin.model.dto;

import by.home.vitamin.model.entity.enums.Color;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompatibilityCounterItem {

    int red;

    int green;

    int white;

    public void increment(Color color) {
        switch (color) {
            case RED:
                this.red++;
                break;
            case GREEN:
                this.green++;
                break;
            case WHITE:
                this.white++;
                break;
            default: break;
        }
    }
}
