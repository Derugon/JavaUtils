package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functions to generate ranges
 */
public final class Range {
    /**
     * Creates a range as a list of integers
     *
     * @param  max maximum value of the range
     * @return     a list of integers from 1 to max
     */
    public static int[] asArray( final int max ) {
        return asArray( 1, max );
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  min minimum value of the range
     * @param  max maximum value of the range
     * @return     a list of integers from min to max
     */
    public static int[] asArray( final int min, final int max ) {
        return asArray( min, 1, max );
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  min  minimum value of the range
     * @param  step step
     * @param  max  maximum value of the range
     * @return      a list of integers from min to max
     */
    public static int[] asArray( final int min, final int step, final int max ) {
        final int[] array = new int[ ( max - min ) / step ];
        Arrays.setAll( array, i -> min + step * i );
        return array;
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  max maximum value of the range
     * @return     a list of integers from 1 to max
     */
    public static List<Double> asDoubleList( final double max ) {
        return asDoubleList( 1., max );
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  min minimum value of the range
     * @param  max maximum value of the range
     * @return     a list of integers from min to max
     */
    public static List<Double> asDoubleList( final double min, final double max ) {
        return asDoubleList( min, 1., max );
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  min  minimum value of the range
     * @param  step step
     * @param  max  maximum value of the range
     * @return      a list of integers from min to max
     */
    public static List<Double> asDoubleList( final double min, final double step, final double max ) {
        final List<Double> list = new ArrayList<>();
        for ( double i = min ; i <= max ; i += step )
            list.add( i );
        return list;
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  max maximum value of the range
     * @return     a list of integers from 1 to max
     */
    public static List<Integer> asIntegerList( final int max ) {
        return asIntegerList( 1, max );
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  min minimum value of the range
     * @param  max maximum value of the range
     * @return     a list of integers from min to max
     */
    public static List<Integer> asIntegerList( final int min, final int max ) {
        return asIntegerList( min, 1, max );
    }

    /**
     * Creates a range as a list of integers
     *
     * @param  min  minimum value of the range
     * @param  step step
     * @param  max  maximum value of the range
     * @return      a list of integers from min to max
     */
    public static List<Integer> asIntegerList( final int min, final int step, final int max ) {
        final List<Integer> list = new ArrayList<>();
        for ( int i = min ; i <= max ; i += step )
            list.add( i );
        return list;
    }
}
