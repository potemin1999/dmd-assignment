package awesteam.dmd.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Nothing personal
 * Just security
 */
public class SecurityManager {

    private static final Wrap<byte[]> wrap = new Wrap<>();

    private static byte[] apply(Supplier<byte[]> in_func,
                                Function<byte[], byte[]> func) {
        return func.apply(in_func.get());
    }

    public static String encodeString(String s) {
        return new String(apply(s::getBytes, wrap::a));
    }

    public static String decodeString(String string) {
        return new String(apply(string::getBytes, wrap::b));
    }


    private static class Wrap<T> {

        private final Function<byte[], String> _F;
        private Function<T, T> _Fa;
        private Function<T, T> _Fb;

        Wrap() {
            _F = (byte[] in) -> {
                for (int i = 0; i < in.length >> 1; i++) {
                    if (i % 4 == 0) continue;
                    byte b = (byte) (128-in[i]);
                    in[i] = (byte) (128-in[in.length - i - 1]);
                    in[in.length - i - 1] = b;
                }
                return new String(in);
            };
            try {
                Class<?> _a = Class.forName(b0("amF2YS51dGlsLkJhc2U2NA=="));
                Method _c = _a.getMethod(b0("Z2V0RW5jb2Rlcg=="));
                Method _d = _a.getMethod(b0("Z2V0RGVjb2Rlcg=="));
                Object _e = _c.invoke(null);
                Object _f = _d.invoke(null);
                Class<?> _g = _e.getClass();
                Class<?> _h = _f.getClass();
                Class<?> _i = Class.forName(b0("W0I="));
                Method _j = _g.getMethod(b0("ZW5jb2Rl"), _i);
                Method _k = _h.getMethod(b0("ZGVjb2Rl"), _i);
                _Fa = (__i) -> inv(_j, _e, __i);
                _Fb = (__i) -> inv(_k, _f, __i);
            } catch (ClassNotFoundException | NoSuchMethodException |
                    IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        @SuppressWarnings("unchecked")
        private static <T> T inv(final Method m, final Object obj, T in) {
            try {
                return (T) m.invoke(obj, in);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                return null;
            }
        }

        String b0(String str) {
            return new String(java.util.Base64.getDecoder().decode(str));
        }

        T a(T in) {
            return _Fa.apply((T) _F.apply((byte[]) in).getBytes());
        }

        T b(T out) {
            return (T) _F.apply((byte[]) _Fb.apply(out)).getBytes();
        }

    }

}
