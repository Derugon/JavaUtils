/**
 * Provides an unprotected cloning method, not like Object.clone(), and allowing
 * polymorphism, not like a copy constructor
 *
 * @param <T> type on whioh the interface is implemented
 */
public interface DeepCloneable<T extends DeepCloneable<T>> {
    /**
     * Creates a clone of the object
     *
     * @return a clone of the object
     */
    T deepClone();
}
