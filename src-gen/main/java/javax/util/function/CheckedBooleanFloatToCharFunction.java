/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.CheckedFunction2;

@FunctionalInterface
public interface CheckedBooleanFloatToCharFunction extends CheckedFunction2<Boolean, Float, Character> {

    static final long serialVersionUID = 1L;

    char applyAsChar(boolean left, float right) throws Throwable;

    @Override
    default Character apply(Boolean left, Float right) throws Throwable {
        return applyAsChar(left, right);
    }

}