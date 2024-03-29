package backspace.display.api.websocket.live;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class LiveFrameUpdateRequestBase64 {
    private List<String> pixelsBrightnesses;
}
