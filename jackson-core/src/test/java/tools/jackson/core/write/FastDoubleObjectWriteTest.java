package tools.jackson.core.write;

import tools.jackson.core.StreamWriteFeature;
import tools.jackson.core.json.JsonFactory;

public class FastDoubleObjectWriteTest extends ObjectWriteTest {
    private final JsonFactory FACTORY = JsonFactory.builder().enable(StreamWriteFeature.USE_FAST_DOUBLE_WRITER).build();

    @Override
    protected JsonFactory jsonFactory() {
        return FACTORY;
    }
}
