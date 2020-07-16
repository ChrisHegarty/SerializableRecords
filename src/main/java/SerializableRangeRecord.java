import java.io.Serializable;

public record SerializableRangeRecord (int lo, int hi) implements Range, Serializable {

    public SerializableRangeRecord {
        if (lo > hi)
            throw new IllegalArgumentException(String.format("%d, %d", lo, hi));
    }
 }
