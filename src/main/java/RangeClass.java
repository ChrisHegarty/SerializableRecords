import java.io.Serializable;
import java.util.Objects;

public class SerializableRangeClass implements Range, Serializable {
    private static final long serialVersionUID =  3062445820455132620L;
    private final int lo;
    private final int hi;
    public SerializableRangeClass (int lo, int hi) {
        if (lo > hi)
            throw new IllegalArgumentException(String.format("%d, %d", lo, hi));
        this.lo = lo;
        this.hi = hi;
    }
    @Override public int lo() { return lo; }
    @Override public int hi() { return hi; }
    @Override public boolean equals(Object other) {
        if (other instanceof SerializableRangeClass that
                && this.lo == that.lo && this.hi == that.hi) {
            return true;
        }
        return false;
    }
    @Override public int hashCode() {
        return Objects.hash(lo, hi);
    }
    @Override public String toString() {
      return String.format("%s[lo=%d, hi=%d]", getClass().getName(), lo, hi);
    }
}
