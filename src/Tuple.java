/**
 * Tuple
 *
 * @param <T> first element
 * @param <U> second element
 */
public class Tuple<T, U> implements DeepCloneable<Tuple<T, U>> {
    private static final String SD = "[ ";  //$NON-NLS-1$
    private static final String SM = " ; "; //$NON-NLS-1$
    private static final String SF = " ]";  //$NON-NLS-1$

    /**
     * First element
     */
    private final T first;
    /**
     * Second element
     */
    private final U second;

    /**
     * Creates a tuple
     *
     * @param first  first element
     * @param second second element
     */
    public Tuple( final T first, final U second ) {
        this.first  = first;
        this.second = second;
    }

    /**
     * Creates a copy of a tuple
     *
     * @param other tuple to copy
     */
    @SuppressWarnings( "unchecked" )
    public Tuple( final Tuple<T, U> other ) {
        first  = other.first instanceof DeepCloneable<?>
                ? (T) ( (DeepCloneable<? extends DeepCloneable<?>>) other.first ).deepClone() : other.first;
        second = other.second instanceof DeepCloneable<?>
                ? (U) ( (DeepCloneable<? extends DeepCloneable<?>>) other.second ).deepClone() : other.second;
    }

    @Override
    public Tuple<T, U> deepClone() {
        return new Tuple<>( this );
    }

    @Override
    public boolean equals( final Object obj ) {
        return obj instanceof Tuple && first.equals( ( (Tuple<?, ?>) obj ).first )
               && second.equals( ( (Tuple<?, ?>) obj ).second );
    }

    /**
     * Gets the first element of the tuple
     *
     * @return the first element of the tuple
     */
    public T first() {
        return first;
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }

    /**
     * Gets the second element of the tuple
     *
     * @return the second element of the tuple
     */
    public U second() {
        return second;
    }

    @Override
    public String toString() {
        return SD + first + SM + second + SF;
    }
}
