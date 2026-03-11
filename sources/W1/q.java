package w1;

import java.io.Serializable;
import java.math.BigInteger;
import y1.h;

public final class q extends m {

    /* renamed from: f  reason: collision with root package name */
    public final Serializable f4743f;

    public q(Boolean bool) {
        bool.getClass();
        this.f4743f = bool;
    }

    public static boolean e(q qVar) {
        Serializable serializable = qVar.f4743f;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        Serializable serializable = this.f4743f;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(c());
    }

    public final String c() {
        Serializable serializable = this.f4743f;
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    public final Number d() {
        Serializable serializable = this.f4743f;
        if (serializable instanceof String) {
            return new h((String) serializable);
        }
        return (Number) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        Serializable serializable = this.f4743f;
        Serializable serializable2 = qVar.f4743f;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (!e(this) || !e(qVar)) {
            if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
                return serializable.equals(serializable2);
            }
            double doubleValue = d().doubleValue();
            double doubleValue2 = qVar.d().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (d().longValue() == qVar.d().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f4743f;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = d().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public q(Number number) {
        number.getClass();
        this.f4743f = number;
    }

    public q(String str) {
        str.getClass();
        this.f4743f = str;
    }
}
