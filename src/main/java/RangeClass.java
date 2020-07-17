import java.io.Serializable;
import java.util.Objects;

public class RangeClass implements Serializable {
    private static final long serialVersionUID = -3305276997530613807L;
    private final int lo;
    private final int hi;
    public RangeClass(int lo, int hi) {
        if (lo > hi)
            throw new IllegalArgumentException(String.format("%d, %d", lo, hi));
        this.lo = lo;
        this.hi = hi;
    }
    public int lo() { return lo; }
    public int hi() { return hi; }
    @Override public boolean equals(Object other) {
        if (other instanceof RangeClass that
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
